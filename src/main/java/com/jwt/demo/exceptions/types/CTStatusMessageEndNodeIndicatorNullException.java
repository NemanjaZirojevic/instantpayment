package com.jwt.demo.exceptions.types;

public class CTStatusMessageEndNodeIndicatorNullException extends Exception {
    private String message;
    public CTStatusMessageEndNodeIndicatorNullException(String message)
    {
        super(message);
    }
}
