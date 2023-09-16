package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    public void testPositiveData() {
        assertThat(Point.distance(12, 19, 23, 42))
                .isCloseTo(25.4, within(0.1));
    }

    @Test
    public void testNegativeData() {
        assertThat(Point.distance(-77, -45, -63, -92))
                .isCloseTo(49.1, within(0.1));
    }
}