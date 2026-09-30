package com.orderflow.events;

public final class RoutingKeys {
    public static final String ORDER_CREATED = "order.created";
    public static final String RESTAURANT_ACCEPTED = "restaurant.accepted";
    public static final String RESTAURANT_REJECTED = "restaurant.rejected";
    public static final String FOOD_PREPARING = "restaurant.food_preparing";
    public static final String FOOD_READY = "restaurant.food_ready";
    public static final String DELIVERY_REQUESTED = "delivery.requested";
    public static final String DRIVER_ASSIGNED = "delivery.driver_assigned";
    public static final String ORDER_PICKED_UP = "delivery.picked_up";
    public static final String ORDER_DELIVERED = "delivery.delivered";

    private RoutingKeys() {
    }
}
