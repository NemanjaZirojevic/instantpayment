package com.jwt.demo.exceptions.types;

public class CTStatusMessageTIDNullException extends Exception {
    private String message;
    public CTStatusMessageTIDNullException(String message)
    {
        super(message);
    }
}
