package com.jwt.demo.exceptions.types;

public class JwtTidEmptyException  extends  Exception{
    private  String message;

    public JwtTidEmptyException(String message){
        super(message);
    }

}
