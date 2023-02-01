# SPRING SECURITY

## Description

This module contains implementations of a different Spring security concepts. What is currently implemented:
* JWT


## Technology

* Backend: Java 17
* Framework: Spring 3
* Database: PostgreSQL


## How to run

Just start the app and head over to Postman to test it. Use 3 endpoints:
* /api/v1/auth/register -> for registration to get token that will be used for authentication
* /api/v1/auth/authenticate -> for authentication with username and password
* /api/v1/demo -> run the test to see if authentication passed, choose Authorization type - Bearer token
