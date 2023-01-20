#!/bin/bash

echo 'Running localstack locally using docker'
docker compose up -d
echo 'Configure the AWS CLI for local profile'
unset AWS_PROFILE
export AWS_PAGER=""
aws configure --profile local
aws configure set aws_access_key_id foo --profile local
aws configure set aws_secret_access_key bar --profile local
aws configure set default.region eu-central-1 --profile local
echo 'Creating SQS test_sqs.fifo'
aws --endpoint-url http://localhost:4566 sqs create-queue --queue-name test_sqs.fifo --attributes FifoQueue=true --profile local
echo '... done'