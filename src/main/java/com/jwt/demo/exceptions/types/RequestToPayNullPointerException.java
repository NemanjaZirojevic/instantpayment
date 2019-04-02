package com.jwt.demo.exceptions.types;

public class RequestToPayNullPointerException extends Exception {

    private String message;

    public RequestToPayNullPointerException(String message){
        super(message);
    }
}
