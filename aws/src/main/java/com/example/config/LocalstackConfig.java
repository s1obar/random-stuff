package com.example.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalstackConfig {
    @Value("${localstack.endpoint}")
    private String localstackEndpoint;
    @Value("${localstack.region}")
    private String region;
    @Value("${localstack.access-key}")
    private String accessKey;
    @Value("${localstack.secret-key}")
    private String secretKey;

    @Bean(name = "localstackSqs", destroyMethod = "shutdown")
    public AmazonSQSAsync localstackSqs(){
        return AmazonSQSAsyncClient.asyncBuilder()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(localstackEndpoint, region))
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey,secretKey)))
                .build();
    }
}
