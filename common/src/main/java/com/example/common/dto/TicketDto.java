package com.example.common.dto;

import java.util.UUID;

public record TicketDto(
    UUID id,
    UUID userId,
    UUID eventId,
    String qrCode
) {}
