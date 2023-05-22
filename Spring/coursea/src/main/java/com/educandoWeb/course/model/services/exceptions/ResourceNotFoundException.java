package com.educandoWeb.course.model.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
