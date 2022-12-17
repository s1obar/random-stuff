package com.example.domain.model.exception;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Builder
public record ExceptionInfo(String message, HttpStatus httpStatus, ZonedDateTime timestamp) {
}
