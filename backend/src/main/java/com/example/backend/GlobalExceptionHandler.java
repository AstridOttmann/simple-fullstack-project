package com.example.backend;

import com.example.backend.exceptions.ApiError;
import com.example.backend.exceptions.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.Collections;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({EntityNotFoundException.class, GradeNotFoundException.class})
    public ResponseEntity<ApiError> handleEntityNotFoundException(EntityNotFoundException e) {
        ApiError apiError = new ApiError(Collections.singletonList(e.getMessage()), Instant.now());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

}
