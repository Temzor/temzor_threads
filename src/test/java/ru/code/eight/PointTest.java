package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class PointTest {
    @Test
    void test() {
        assertThat(2.828)
                .isCloseTo(Point.distance(1, 2, 3, 4), within(0.01));
    }
}