package com.jwt.demo.controller;
import com.jwt.demo.entities.AuthResponse;
import com.jwt.demo.exceptions.types.JwtTidEmptyException;
import com.jwt.demo.exceptions.types.JwtTidNullException;
import com.jwt.demo.exceptions.types.JwtUserHashIdEmptyException;
import com.jwt.demo.exceptions.types.JwtUserHashIdNullPointerException;
import com.jwt.demo.model.JwtUser;
import com.jwt.demo.security.JwtGenerator;
import com.jwt.demo.utilities.Utility;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/token",consumes = MediaType.APPLICATION_JSON_VALUE)
@Api(description = "Contains endpoint for generating session token and retrieving tid,default payment method,account number,merchant place,merchant address..")
public class TokenController extends Utility
{

    @Autowired
    private JwtGenerator jwtGenerator;


    private final Logger log = LoggerFactory.getLogger(TokenController.class);

    @PostMapping("/generate")
    @ApiOperation(value = "Returns session token, together with tid,default payment method,account number,merchant place,merchant address",produces = "application/json")
    public ResponseEntity<AuthResponse> generate(@ApiParam("Hashed unique userId. Cannot be empty")@RequestBody final JwtUser jwtUser) throws JwtUserHashIdEmptyException, JwtUserHashIdNullPointerException, JwtTidNullException, JwtTidEmptyException {

        log.warn(LOGGING_PATTERN + getLineNumber() + " Entered generate TOKEN method");
        System.out.println(jwtUser);
        if(jwtUser.getHashedUserId()==null)
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + " Hashed user id is NULL");
            throw new JwtUserHashIdNullPointerException("User id cannot be null");

        }
        if(jwtUser.getHashedUserId().isEmpty())
        {
            log.debug(LOGGING_PATTERN + getLineNumber() + " Hashed user id is EMPTY");
            throw new JwtUserHashIdEmptyException("User id cannot be empty");
        }
        if(jwtUser.getTid()==null)
        {
            throw  new JwtTidNullException("TID cannot be null!");
        }
        if(jwtUser.getTid().trim().equalsIgnoreCase(""))
        {
            throw  new JwtTidEmptyException("TID cannot be empty!");
        }

        else {
            List<String> roles = new ArrayList<>();
            roles.add("ROLE_USER");
            //authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtUser.getHashedUserId(), jwtUser.getTid()));
            String token = jwtGenerator.generate(jwtUser);
            AuthResponse authResponse = new AuthResponse();
            authResponse.setSessionToken(token);
            authResponse.setTid("KC1001");
            authResponse.setAccNumber("43112");
            authResponse.setDefaultPaymentMethod("P");
            authResponse.setMerchantAddress("Test address");
            authResponse.setMerchantName("Test merchant name");
            authResponse.setMerchantPlaceName("Test merchant place");
            log.warn(LOGGING_PATTERN + " Displaying authentication response : "+authResponse.toString());
            return new ResponseEntity<AuthResponse>(authResponse, HttpStatus.OK);
        }
    }
}