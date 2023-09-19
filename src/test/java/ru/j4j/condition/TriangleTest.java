package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    void testTrue() {
        assertThat(Triangle.exist(12, 14, 15)).isTrue();
    }

    @Test
    void testFalse() {
        assertThat(Triangle.exist(1, 14, 15)).isFalse();
    }
}