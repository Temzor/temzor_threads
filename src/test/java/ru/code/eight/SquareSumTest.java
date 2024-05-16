package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareSumTest {
    @Test
    void testSquareSum() {
        assertThat(9).isEqualTo(SquareSum.squareSum(new int[]{1, 2, 2}));
        assertThat(5).isEqualTo(SquareSum.squareSum(new int[]{1, 2}));
        assertThat(50).isEqualTo(SquareSum.squareSum(new int[]{5, -3, 4}));
        assertThat(0).isEqualTo(SquareSum.squareSum(new int[]{}));
    }
}