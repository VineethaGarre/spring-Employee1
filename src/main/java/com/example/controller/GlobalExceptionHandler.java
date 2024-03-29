package com.example.controller;
import javax.servlet.http.HttpServletRequest;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

 

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleRuntimeException(HttpServletRequest request, Exception ex){
        System.out.println("Golbal exception handler");
        System.out.println("RuntimeException Occured:: URL="+request.getRequestURL() +" raised "+ex);
        return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.NOT_FOUND);    
    }

 


}


