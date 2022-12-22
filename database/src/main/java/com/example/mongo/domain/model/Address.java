package com.example.mongo.domain.model;

import lombok.Builder;

@Builder
public record Address(String country, String city, String postCode) {}
