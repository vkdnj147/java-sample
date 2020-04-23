package com.sample.app.api.sample.common.exception;

import org.springframework.http.HttpStatus;

public class FrogException extends RuntimeException {

    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    private ErrorMessageCode errorMessagerCode = ErrorMessageCode.ERROR;
    //private List<FrogError> errors;


    public FrogException(String message) {
        super(message);
    }

    public FrogException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public FrogException(String message, HttpStatus httpStatus, ErrorMessageCode errorMessagerCode) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorMessagerCode = errorMessagerCode;
    }

    public FrogException(String message, ErrorMessageCode errorMessagerCode) {
        super(message);
        this.errorMessagerCode = errorMessagerCode;
    }

    public FrogException(ErrorMessageCode errorMessagerCode) {
        this.errorMessagerCode = errorMessagerCode;
    }


    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public ErrorMessageCode getErrorMessagerCode() {
        return this.errorMessagerCode;
    }

//    public List<FrogError> getErrors() {
//        return this.errors;
//    }
//
//    public void setErrors(List<FrogError> errors) {
//        this.errors = errors;
//    }
}
