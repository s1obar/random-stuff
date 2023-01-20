#!/bin/bash
## How To Simulate everything locally:
##'Receiving Event from SQS'

aws --endpoint-url http://localhost:4566 sqs receive-message --queue-url http://localhost:4566/000000000000/test_sqs.fifo --profile local

##Deleting the message from fifo queue will allow to receive the next message. Use the receipt-handle from the received message
##aws --endpoint-url=http://localhost:4566 sqs delete-message --queue-url http://localhost:4566/000000000000/test_sqs.fifo --receipt-handle <...>
