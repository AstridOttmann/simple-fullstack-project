package com.example.backend.exceptions;

import java.time.Instant;

public record ApiError(
        String message,
        Instant timestamp) {
}
