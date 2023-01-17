package com.example.controller.globalexception;

import com.example.domain.model.ExceptionInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZonedDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException e){
        HttpStatus badRequestStatus = HttpStatus.NOT_FOUND;
        ExceptionInfo exceptionInfo = ExceptionInfo.builder()
                  .message(e.getMessage())
                  .httpStatus(HttpStatus.NOT_FOUND)
                  .timestamp(ZonedDateTime.now()).build();
        return new ResponseEntity<>(exceptionInfo, badRequestStatus);

    }
}
