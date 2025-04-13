package com.example.common.dto;

import java.time.LocalDate;
import java.util.UUID;

public record EventDto(
    UUID id,
    String title,
    String location,
    LocalDate date,
    String imageUrl
) {}
