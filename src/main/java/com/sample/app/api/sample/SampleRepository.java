package com.sample.app.api.sample;

import com.frogbyhinter.app.api.common.model.ActiveType;
import com.frogbyhinter.app.api.sample.model.Sample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends CrudRepository<Sample, Long> {
    Page<Sample> findAllByActive(Pageable pageable, ActiveType activeType);

    Sample findByIdAndActive(Long id, ActiveType active);

}