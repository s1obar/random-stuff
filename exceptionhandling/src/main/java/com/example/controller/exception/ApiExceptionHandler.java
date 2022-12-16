package com.example.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
        HttpStatus badRequestStatus = HttpStatus.NOT_FOUND;
        ApiException apiException = ApiException.builder()
                  .message(e.getMessage())
                  .httpStatus(HttpStatus.NOT_FOUND)
                  .timestamp(ZonedDateTime.now()).build();
        return new ResponseEntity<>(apiException, badRequestStatus);

    }
}
