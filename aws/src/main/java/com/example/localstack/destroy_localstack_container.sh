#!/bin/bash

echo 'Destroying localstack container'
docker compose down
echo 'Unset the aws local profile'
unset AWS_ACCESS_KEY_ID
unset AWS_SECRET_ACCESS_KEY
unset AWS_DEFAULT_REGION
echo '... Done!'
