package com.jwt.demo.exceptions.types;

import org.springframework.security.core.parameters.P;

public class CTStatusMessageCreditTransferIdentificatorNullException extends Exception {
    private String message;
    public  CTStatusMessageCreditTransferIdentificatorNullException(String message)
    {
        super(message);
    }
}
