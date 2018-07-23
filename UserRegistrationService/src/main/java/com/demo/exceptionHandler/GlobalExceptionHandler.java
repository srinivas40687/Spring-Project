package com.demo.exceptionHandler;

import java.security.InvalidParameterException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ClientError> handleGlobalException(HttpServletRequest req, Exception e)
    {
        ClientError error = new ClientError(e.toString(), req.getRequestURI());
        return new ResponseEntity<ClientError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {InvalidParameterException.class})
    public ResponseEntity<ClientError> handleIvalidPropException(HttpServletRequest req, Exception e)
    {
        ClientError error = new ClientError(e.toString(), req.getRequestURI());
        return new ResponseEntity<ClientError>(error, HttpStatus.BAD_REQUEST);
    }
}
