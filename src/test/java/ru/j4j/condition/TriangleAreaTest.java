package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleAreaTest {
    @Test
    public void testPositiveData() {
        assertThat(TriangleArea.area(11.3, 14.8, 16.9))
                .isCloseTo(82.21, within(0.1));
    }

    @Test
    public void testNegativeData() {
        assertThat(TriangleArea.area(-16.3, -24.2, -36.7))
                .isCloseTo(153.46, within(0.1));
    }

}