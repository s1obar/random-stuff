package com.example.domain.model;

import lombok.Builder;

@Builder
public record Customer(Long id, String name) {
}
