package com.orderflow.order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceApplicationTest {
    @Test
    void applicationClassIsPresent() {
        assertThat(OrderServiceApplication.class).isNotNull();
    }
}
