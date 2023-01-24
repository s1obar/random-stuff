package com.example.controller;

import com.example.sqs.SqsPublisher;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/aws")
@RequiredArgsConstructor
public class AwsController {
    private final SqsPublisher sqsPublisher;

    @PostMapping("/publish-to-queue")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Publishes a message to test queue on localstack.")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success")
    })
    public void publishToSqsQueue(@RequestParam String message){
        sqsPublisher.publish(message);
    }
}
