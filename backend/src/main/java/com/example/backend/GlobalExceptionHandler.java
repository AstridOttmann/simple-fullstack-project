package com.example.backend;

import com.example.backend.exceptions.ApiError;
import com.example.backend.exceptions.CourseNotFoundException;
import com.example.backend.exceptions.GradeNotFoundException;
import com.example.backend.exceptions.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ApiError> handleStudentNotFoundException(StudentNotFoundException e){
        ApiError apiError = new ApiError(e.getMessage(), Instant.now());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(GradeNotFoundException.class)
    public ResponseEntity<ApiError> handleGradeNotFoundException(GradeNotFoundException e){
        ApiError apiError = new ApiError(e.getMessage(), Instant.now());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ApiError> handleGradeNotFoundException(CourseNotFoundException e){
        ApiError apiError = new ApiError(e.getMessage(), Instant.now());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
