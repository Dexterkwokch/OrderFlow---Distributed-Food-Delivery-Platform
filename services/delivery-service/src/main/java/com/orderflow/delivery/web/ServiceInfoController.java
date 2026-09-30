package com.orderflow.delivery.web;

import com.orderflow.events.EventType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/deliveries")
public class ServiceInfoController {
    @GetMapping("/_info")
    Map<String, Object> info() {
        return Map.of(
                "service", "delivery-service",
                "responsibilities", List.of("create delivery jobs", "assign drivers", "publish delivery progress"),
                "emits", List.of(
                        EventType.DELIVERY_REQUESTED,
                        EventType.DRIVER_ASSIGNED,
                        EventType.ORDER_PICKED_UP,
                        EventType.ORDER_DELIVERED
                ),
                "consumes", List.of(EventType.RESTAURANT_ACCEPTED, EventType.FOOD_READY)
        );
    }
}
