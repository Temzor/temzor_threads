package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    public void testPositiveData() {
        Point first = new Point(12, 19);
        Point second = new Point(23, 42);
        double result = 25.5;
        double expect = first.distance(second);
        assertThat(result)
                .isCloseTo(expect, within(0.01));
    }

    @Test
    public void testNegativeData() {
        Point first = new Point(-77, -45);
        Point second = new Point(-63, -92);
        double result = 49.04;
        double expect = second.distance(first);
        assertThat(result)
                .isCloseTo(expect, within(0.01));
    }
}