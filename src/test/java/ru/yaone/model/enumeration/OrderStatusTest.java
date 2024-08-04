package ru.yaone.model.enumeration;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderStatusTest {

    @Test
    void testOrderStatusValues() {
        OrderStatus[] expectedValues = {OrderStatus.PENDING, OrderStatus.APPROVED, OrderStatus.REJECTED};
        assertThat(OrderStatus.values()).containsExactly(expectedValues);
    }
}