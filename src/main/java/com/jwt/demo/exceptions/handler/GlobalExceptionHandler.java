package com.jwt.demo.exceptions.handler;

import com.jwt.demo.exceptions.types.*;
import com.jwt.demo.security.InvalidJwtAuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;
import static org.springframework.http.ResponseEntity.status;


@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(JwtUserHashIdEmptyException.class)
    public void jwtUserIdEmptyExceptionHandler(JwtUserHashIdEmptyException excepiton, HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }

    @ExceptionHandler(JwtUserHashIdNullPointerException.class)
    public void jwtUserIdNullPointerExceptionHandler(JwtUserHashIdNullPointerException excepiton, HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }

    @ExceptionHandler(JwtTidNullException.class)
    public void jwtTIDNullPointerExceptionHandler(JwtTidNullException excepiton, HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }

    @ExceptionHandler(JwtTidEmptyException.class)
    public void jwtTIDEmptyExceptionHandler(JwtTidEmptyException excepiton, HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }
    @ExceptionHandler(ActivationCodeNullException.class)
    public void activationCodedNullPointerExceptionHandler(ActivationCodeNullException excepiton, HttpServletResponse httpServletResponse) throws IOException {
         createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }

    @ExceptionHandler(ActivationCodeEmptyException.class)
    public void activationCodeEmptyExceptionHandler(ActivationCodeEmptyException excepiton,HttpServletResponse httpServletResponse) throws IOException {
         createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }
    @ExceptionHandler(UserIdEmptyException.class)
    public void userIdEmptyException(UserIdEmptyException excepiton, HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }
    @ExceptionHandler(UserIdNullException.class)
    public void userIdNullException(UserIdNullException excepiton,HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }
    @ExceptionHandler(SecureAndroidIdEmptyException.class)
    public void secureAndroidIdEmptyException(SecureAndroidIdEmptyException excepiton, HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }
    @ExceptionHandler(SecureAndroidIdNullException.class)
    public void secureAndroidIdNullException(SecureAndroidIdNullException excepiton,HttpServletResponse httpServletResponse) throws IOException {
        createErrorResponseResponseEntity(excepiton,httpServletResponse);

    }
    private void createErrorResponseResponseEntity(Exception excepiton,HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendError(HttpStatus.BAD_REQUEST.value(),excepiton.getMessage());
    }
}
