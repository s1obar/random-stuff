package com.example.sqs;

import org.springframework.beans.factory.annotation.Value;

public class SqsPublisher {
    @Value("${localstack.queue.name}")
    private String queueName;

    
}
