package com.orderflow.restaurant;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RestaurantServiceApplicationTest {
    @Test
    void applicationClassIsPresent() {
        assertThat(RestaurantServiceApplication.class).isNotNull();
    }
}
