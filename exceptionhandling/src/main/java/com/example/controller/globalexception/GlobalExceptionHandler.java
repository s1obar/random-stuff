package com.example.controller.globalexception;

import com.example.domain.model.ExceptionInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
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
