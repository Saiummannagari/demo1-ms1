package com.example.demo;

import feign.RetryableException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(value = ArithmeticException.class)
    public ResponseEntity arithematicException(){
        return ResponseEntity.status(403).body("exception");
    }

    @ExceptionHandler(value = RetryableException.class)
    public ResponseEntity retryableException(){
        return ResponseEntity.status(403).body("retryable exception");
    }

}
