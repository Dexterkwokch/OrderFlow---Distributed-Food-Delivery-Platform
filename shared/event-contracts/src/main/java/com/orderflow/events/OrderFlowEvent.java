package com.orderflow.events;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public record OrderFlowEvent<T>(
        UUID eventId,
        EventType eventType,
        Instant occurredAt,
        UUID orderId,
        T payload
) {
    public OrderFlowEvent {
        Objects.requireNonNull(eventId, "eventId is required");
        Objects.requireNonNull(eventType, "eventType is required");
        Objects.requireNonNull(occurredAt, "occurredAt is required");
        Objects.requireNonNull(orderId, "orderId is required");
    }

    public static <T> OrderFlowEvent<T> now(EventType eventType, UUID orderId, T payload) {
        return new OrderFlowEvent<>(UUID.randomUUID(), eventType, Instant.now(), orderId, payload);
    }
}
