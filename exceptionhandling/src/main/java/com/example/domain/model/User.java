package com.example.domain.model;

import lombok.Builder;

@Builder
public record User(Long id, String name) {
}
