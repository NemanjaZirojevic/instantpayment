package com.jwt.demo.exceptions.types;

public class RequestToPayEmptyFieldException extends  Exception {

    private String message;

    public RequestToPayEmptyFieldException(String message){
        super(message);
    }
}
