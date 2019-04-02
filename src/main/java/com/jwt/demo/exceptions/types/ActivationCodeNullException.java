package com.jwt.demo.exceptions.types;


public class ActivationCodeNullException extends Exception
{
    private String message;
    public ActivationCodeNullException(String message)
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
