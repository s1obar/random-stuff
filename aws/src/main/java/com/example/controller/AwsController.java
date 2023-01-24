package com.example.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/aws")
@RequiredArgsConstructor
public class AwsController {
    @PostMapping("publish-to-queue")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Publishes a message to test queue on localstack.")
    public void publishToSqsQueue(){

    }
}
