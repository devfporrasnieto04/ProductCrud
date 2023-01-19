package com.exampleCrud.exception;

public class ResourceNotFoundException extends RuntimeException{
    private static final Long SerialVersionUID = 1L;
    public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
