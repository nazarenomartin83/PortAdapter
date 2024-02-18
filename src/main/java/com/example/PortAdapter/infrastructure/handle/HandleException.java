package com.example.PortAdapter.infrastructure.handle;

import com.example.PortAdapter.domain.exception.CompanyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException {
    @ExceptionHandler(CompanyException.class)
    public ResponseEntity<String> handleException(CompanyException exception)
    {
        return ResponseEntity
                .status(exception.getHttpStatus())
                .body(exception.getMessage());
    }
}
