package com.sample.app.api.sample;

import com.frogbyhinter.app.api.common.model.ActiveType;
import com.frogbyhinter.app.api.sample.model.Sample;
import com.frogbyhinter.app.api.sample.view.SampleView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.EmptyStackException;

@Slf4j
@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    @Transactional(readOnly = true)
    public Page<SampleView> findAll(Integer page, Integer size, Long memberId) {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Page<Sample> samples = sampleRepository.findAllByActive(PageRequest.of(page, size, sort), ActiveType.ACTIVE);
        return samples.map(this::sampleEntityToView);

    }


    @Transactional(readOnly = true)
    public SampleView findById(Long sampleId, Long memberId) {
        Sample sample = sampleRepository.findByIdAndActive(sampleId, ActiveType.ACTIVE);
        if (sample == null) {
            throw new EmptyStackException();
        }
        SampleView sampleView = sampleEntityToView(sample);

        return sampleView;
    }

    @Transactional
    public SampleView post(SampleView sampleView, Long memberId) {
        Sample sample = new Sample();
        sample.setCreatedId(memberId);
        return sampleEntityToView(sampleRepository.save(sampleViewToEntity(sampleView, sample)));
    }

    @Transactional
    public SampleView put(Long sampleId, SampleView sampleView, Long memberId) {
        Sample sample = sampleRepository.findByIdAndActive(sampleId, ActiveType.ACTIVE);
        if (sample == null) {
            throw new EmptyStackException();
        }
        sample.setUpdatedId(memberId);
        sample.setUpdatedAt(LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli());
        return sampleEntityToView(sampleRepository.save(sampleViewToEntity(sampleView, sample)));
    }

    @Transactional
    public SampleView delete(Long sampleId, Long memberId) {
        Sample sample = sampleRepository.findByIdAndActive(sampleId, ActiveType.ACTIVE);
        if (sample == null) {
            throw new EmptyStackException();
        }
        sample.setUpdatedId(memberId);
        sample.setUpdatedAt(LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli());
        sample.setActive(ActiveType.DELETE);
        return sampleEntityToView(sampleRepository.save(sample));
    }

    public SampleView sampleEntityToView(Sample sample) {
        SampleView sampleView = new SampleView(sample);
        return sampleView;
    }

    private Sample sampleViewToEntity(SampleView sampleView, Sample sample) {

        if (StringUtils.isNotBlank(sampleView.getTitle())) {
            sample.setTitle(sampleView.getTitle());
        }

        if (StringUtils.isNotBlank(sampleView.getContents())) {
            sample.setContents(sampleView.getContents());
        }

        return sample;
    }


}
