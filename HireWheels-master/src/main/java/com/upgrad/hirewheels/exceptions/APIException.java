package com.upgrad.hirewheels.exceptions;

public class APIException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public APIException(String exception) {
        super(exception);
    }
}
