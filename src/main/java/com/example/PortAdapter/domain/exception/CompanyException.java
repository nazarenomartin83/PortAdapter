package com.example.PortAdapter.domain.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class CompanyException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;
}
