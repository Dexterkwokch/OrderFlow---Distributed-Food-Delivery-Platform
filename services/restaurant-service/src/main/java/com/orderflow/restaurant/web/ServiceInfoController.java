package com.orderflow.restaurant.web;

import com.orderflow.events.EventType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/restaurants")
public class ServiceInfoController {
    @GetMapping("/_info")
    Map<String, Object> info() {
        return Map.of(
                "service", "restaurant-service",
                "responsibilities", List.of("own restaurant menus", "manage incoming orders", "publish restaurant events"),
                "emits", List.of(
                        EventType.RESTAURANT_ACCEPTED,
                        EventType.RESTAURANT_REJECTED,
                        EventType.FOOD_PREPARING,
                        EventType.FOOD_READY
                ),
                "consumes", List.of(EventType.ORDER_CREATED)
        );
    }
}
