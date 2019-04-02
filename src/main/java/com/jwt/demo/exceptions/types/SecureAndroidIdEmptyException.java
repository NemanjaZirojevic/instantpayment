package com.jwt.demo.exceptions.types;

public class SecureAndroidIdEmptyException extends Exception {
    private String message;
    public SecureAndroidIdEmptyException(String message)
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
