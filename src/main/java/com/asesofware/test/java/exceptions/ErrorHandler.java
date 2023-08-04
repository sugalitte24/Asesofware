package com.asesofware.test.java.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = MechanicAlreadyExist.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public @ResponseBody ExceptionsInfo handleCustomerAlreadyExistsException( MechanicAlreadyExist ex ) {
        return new ExceptionsInfo(HttpStatus.CONFLICT.value(), ex.getMessage());
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ExceptionsInfo handleCustomerAlreadyExistsException( MethodArgumentNotValidException ex ) {
        return new ExceptionsInfo(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody ExceptionsInfo handleCustomerAlreadyExistsException( Exception ex ) {
        return new ExceptionsInfo(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    }
}
