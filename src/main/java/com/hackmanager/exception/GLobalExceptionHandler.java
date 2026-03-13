package com.hackmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleRuntimeException(RuntimeException ex) {
        return ex.getMessage();
    }
}