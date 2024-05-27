package ru.j4j.mal.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to29then9() {
        double expected = 9.05;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 9;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus68to42then14() {
        double expected = 14.14;
        int x1 = -6;
        int y1 = -8;
        int x2 = 4;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus19toMinus22then11() {
        double expected = 11.4;
        int x1 = 1;
        int y1 = -9;
        int x2 = -2;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}