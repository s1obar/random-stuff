package com.example.sqs;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class SqsPublisher {
    @Value("${localstack.queue.name}")
    private String queueName;
    private final AmazonSQSAsync localstackSqs;

    public void publish(String message){
        final String messageId = UUID.randomUUID().toString();

        final SendMessageRequest request =new SendMessageRequest()
                .withQueueUrl(localstackSqs.getQueueUrl(queueName).getQueueUrl())
                .withMessageDeduplicationId(messageId)
                .withMessageGroupId(message)
                .withMessageBody(message);

        log.info("Publishing message {} to queue {}.", message, queueName);
        localstackSqs.sendMessage(request);
    }
}
