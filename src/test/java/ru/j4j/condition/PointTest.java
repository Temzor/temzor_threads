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
    @Test
    public void testPositiveData3D() {
        Point first = new Point(10, 20, 30);
        Point second = new Point(15, 30, 45);
        double result = 18.7;
        double expect = first.distance3D(second);
        assertThat(result)
                .isCloseTo(expect, within(0.01));
    }

    @Test
    public void testNegativeData3D() {
        Point first = new Point(-16, -32, -48);
        Point second = new Point(-55, -45, -35);
        double result = 43.11;
        double expect = second.distance3D(first);
        assertThat(result)
                .isCloseTo(expect, within(0.01));
    }
}