package com.sample.app.api.sample.exception;

import com.frogbyhinter.app.api.common.exception.ErrorMessageCode;
import com.frogbyhinter.app.api.common.exception.FrogException;
import org.springframework.http.HttpStatus;

public class SampleValidException extends FrogException {


    public SampleValidException() {
        super("SampleValidException");
    }

    public SampleValidException(String message) {
        super(message);
    }

    public SampleValidException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);

    }

    public SampleValidException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message, httpStatus, errorMessagerCode);
    }

    public SampleValidException(String message, ErrorMessageCode errorMessagerCode) {
        super(message, errorMessagerCode);
    }

    public SampleValidException(ErrorMessageCode errorMessagerCode) {
        super(errorMessagerCode);

    }

}
