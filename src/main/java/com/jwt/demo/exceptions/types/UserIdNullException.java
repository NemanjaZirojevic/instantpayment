package com.jwt.demo.exceptions.types;

public class UserIdNullException extends Exception {
    private String message;

    public UserIdNullException(String message)
    {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
