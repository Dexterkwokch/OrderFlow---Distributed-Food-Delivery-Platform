package com.orderflow.order.web;

import com.orderflow.events.EventType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
public class ServiceInfoController {
    @GetMapping("/_info")
    Map<String, Object> info() {
        return Map.of(
                "service", "order-service",
                "responsibilities", List.of("create orders", "own order status history", "publish order events"),
                "emits", List.of(EventType.ORDER_CREATED),
                "consumes", List.of(
                        EventType.RESTAURANT_ACCEPTED,
                        EventType.RESTAURANT_REJECTED,
                        EventType.DRIVER_ASSIGNED,
                        EventType.ORDER_PICKED_UP,
                        EventType.ORDER_DELIVERED
                )
        );
    }
}
