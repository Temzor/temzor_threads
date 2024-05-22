package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VectorTest {
    @Test
    void testVector() {
        assertThat(new int[]{1, 2, 2, 3, 5, 6}).isEqualTo(Vector.merge(new int[]{1, 2, 3, 0, 0, 0}, 3,
                new int[]{2, 5, 6}, 3));
    }
}