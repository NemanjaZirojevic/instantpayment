package com.jwt.demo.controller;

import com.jwt.demo.entities.ActivationForm;
import com.jwt.demo.entities.ActivationResponse;
import com.jwt.demo.exceptions.types.*;
import com.jwt.demo.utilities.Utility;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Api("Contains endpoint for app aprivation")
public class ActivationController extends Utility {

    private final Logger log = LoggerFactory.getLogger(ActivationController.class);

    @PostMapping("/activate")
    @ApiOperation(value = "Used to activate application. Returns ActivationResponse object in JSON format",produces = "application/json")
    public ResponseEntity<ActivationResponse> applicationActivation(@ApiParam(value = "Activation form sent in request body.",required = true) @RequestBody ActivationForm activationForm, HttpServletResponse httpServletResponse) throws ActivationCodeNullException, ActivationCodeEmptyException, IOException, UserIdNullException, UserIdEmptyException, SecureAndroidIdNullException {
        log.warn(LOGGING_PATTERN+ getLineNumber() + " Entered applicationActivation method ");
        log.warn(LOGGING_PATTERN+ getLineNumber() + " Activation code : "+activationForm.getActivationCode());
        log.warn(LOGGING_PATTERN+ getLineNumber() + " Hashed userId : "+activationForm.getHashedUserId());
        log.warn(LOGGING_PATTERN + getLineNumber() + " Android ID : "+activationForm.getSecureAndroidId());
        if(activationForm.getActivationCode() == null) {
            log.debug(LOGGING_PATTERN + getLineNumber() + "Activation code is NULL");
            throw new ActivationCodeNullException("Activation code can't be null");
        }
        if(activationForm.getActivationCode().trim().equalsIgnoreCase(""))
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + "Activation code is EMPTY");
            throw new ActivationCodeEmptyException("Activation code can't be empty");
        }
        if(activationForm.getHashedUserId()==null)
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + "User id is NULL");
            throw new UserIdNullException("User id can't be null!");
        }
        if(activationForm.getHashedUserId().trim().equalsIgnoreCase(""))
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + "User id is empty");
            throw new UserIdEmptyException("User id can't be empty!");
        }
        if(activationForm.getSecureAndroidId()==null)
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + "Secure android id is NULL");
            throw new SecureAndroidIdNullException("Android id can't be null!");

        }
        if(activationForm.getSecureAndroidId().trim().equalsIgnoreCase(""))
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + "Secure android id is empty");
            throw new SecureAndroidIdNullException("Android id can't be empty!");

        }
        else {
            ActivationResponse activationResponse = new ActivationResponse();
            activationResponse.setMessage("Application successfully activated");
            activationResponse.setTid("KC10991TEST");
            activationResponse.setStatusCode(0);

            log.warn(LOGGING_PATTERN + getLineNumber() + "Returning activation response  : "+ activationResponse.toString());
            return new ResponseEntity<>(activationResponse, HttpStatus.OK);
        }
    }
}
