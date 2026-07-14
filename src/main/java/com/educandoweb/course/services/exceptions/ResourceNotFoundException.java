package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ResourceNotFoundException(Object id) {
        super("Resource with id " + id + " does not exist");
    }
}
