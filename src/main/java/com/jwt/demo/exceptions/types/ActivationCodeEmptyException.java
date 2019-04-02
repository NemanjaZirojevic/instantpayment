package com.jwt.demo.exceptions.types;

public class ActivationCodeEmptyException extends Exception {
    private String message;
    public ActivationCodeEmptyException(String message)
    {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
