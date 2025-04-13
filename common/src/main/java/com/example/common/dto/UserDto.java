package com.example.common.dto;

import java.util.UUID;

public record UserDto(
    UUID id,
    String email
) {}
