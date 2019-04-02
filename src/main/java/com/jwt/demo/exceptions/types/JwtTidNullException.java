package com.jwt.demo.exceptions.types;

public class JwtTidNullException extends Exception {
    private  String message;

    public JwtTidNullException(String message){
        super(message);
        this.message = message;
    }
}
