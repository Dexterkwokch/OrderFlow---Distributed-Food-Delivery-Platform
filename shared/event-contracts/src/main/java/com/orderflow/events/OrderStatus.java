package com.orderflow.events;

public enum OrderStatus {
    PENDING,
    RESTAURANT_ACCEPTED,
    RESTAURANT_REJECTED,
    PREPARING,
    FOOD_READY,
    DRIVER_ASSIGNED,
    PICKED_UP,
    ON_THE_WAY,
    DELIVERED,
    CANCELLED
}
