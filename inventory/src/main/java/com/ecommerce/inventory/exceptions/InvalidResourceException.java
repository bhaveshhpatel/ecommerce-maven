package com.ecommerce.inventory.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class InvalidResourceException extends RuntimeException {
    private static final long serialVersionUID = 1L;
	private String resourceName;
    private Object resourceValue;

    public InvalidResourceException( String resourceName, Object resourceValue) {
        super(String.format("%s is invalid : '%s'", resourceName, resourceValue));
        this.resourceName = resourceName;
        this.resourceValue = resourceValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public Object getResourceValue() {
        return resourceValue;
    }
}
