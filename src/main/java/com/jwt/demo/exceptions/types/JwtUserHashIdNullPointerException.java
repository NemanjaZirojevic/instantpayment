package com.jwt.demo.exceptions.types;

public class JwtUserHashIdNullPointerException extends  Exception {

    private String message;
    public JwtUserHashIdNullPointerException(String message)
    {
        super(message);
        this.message = message;
    }
}
