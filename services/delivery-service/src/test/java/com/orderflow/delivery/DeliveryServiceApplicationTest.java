package com.orderflow.delivery;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeliveryServiceApplicationTest {
    @Test
    void applicationClassIsPresent() {
        assertThat(DeliveryServiceApplication.class).isNotNull();
    }
}
