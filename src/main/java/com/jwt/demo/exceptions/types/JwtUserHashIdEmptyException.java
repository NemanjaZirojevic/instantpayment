package com.jwt.demo.exceptions.types;

public class JwtUserHashIdEmptyException extends Exception {
    private String message;
    public JwtUserHashIdEmptyException(String message)
    {
        super(message);
        this.message = message;
    }
}
