package com.jwt.demo.exceptions.types;

public class UserIdEmptyException extends Exception{
    String message;

    public UserIdEmptyException(String message)
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
