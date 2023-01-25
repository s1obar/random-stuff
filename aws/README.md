# AWS MODULE

This module covers different AWS services and their implementation using java while testing with localstack.

## Services

### SQS: - simple queue service
### SNS - simple notification service
### S3 - simple storage service


## How to run?

1) Install localstack and docker
2) Run ```localstack start``` from terminal
3) Run ***launch_localstack_container.sh*** which is located in ***localstack*** folder to create services that 
you want to test using localstack
4) run the app and open localhost:8080/ in your browser
5) you can publish any message to localstack using swagger
6) to check if the message was published to test queue you can run ***receive-message-from-sqs.sh***
7) to destroy localstack container you need to run ***destroy_localstack_container.sh***
