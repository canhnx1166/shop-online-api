package com.example.shop.exception;

public class ApiException extends RuntimeException {
    private String errorCode;

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getErrorCode() {
        return errorCode;
    }
}