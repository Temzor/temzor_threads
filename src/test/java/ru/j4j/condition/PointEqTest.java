package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointEqTest {
    @Test
    void testEven() {
        assertThat(PointEq.eq(1, 2, 1, 2)).isTrue();
    }

    @Test
    void testNotEven() {
        assertThat(PointEq.eq(1, 3, 1, 2)).isFalse();
    }
}