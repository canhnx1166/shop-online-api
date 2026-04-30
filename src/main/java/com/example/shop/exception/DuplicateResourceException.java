package com.example.shop.exception;

public class DuplicateResourceException extends ApiException {
    public DuplicateResourceException(String message) {
        super(message, "DUPLICATE_RESOURCE");
    }
}