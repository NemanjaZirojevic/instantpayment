package com.jwt.demo.exceptions.types;

public class CTStatusMessageCreditTransferAmountNullException extends  Exception
{
    private String message;
    public CTStatusMessageCreditTransferAmountNullException(String message){
        super(message);
    }
}
