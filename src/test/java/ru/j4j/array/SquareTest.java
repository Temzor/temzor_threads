package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculateSquare(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculateSquare(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBoundIs0_thenReturnEmptyArray() {
        int[] result = Square.calculateSquare(0);
        assertThat(result).isEmpty();
    }

    @Test
    public void whenBoundIs1_thenReturnArrayWithSingleElement0() {
        int[] result = Square.calculateSquare(1);
        assertThat(result).containsExactly(0);
    }

    @Test
    public void whenBoundIs2_thenReturnArrayWithElements0And1() {
        int[] result = Square.calculateSquare(2);
        assertThat(result).containsExactly(0, 1);
    }

    @Test
    public void whenBoundIs5_thenReturnArrayWithElements0To16() {
        int[] result = Square.calculateSquare(5);
        assertThat(result).containsExactly(0, 1, 4, 9, 16);
    }

    @Test
    public void whenBoundIs10_thenReturnArrayWithCorrectSquares() {
        int[] result = Square.calculateSquare(10);
        assertThat(result).containsExactly(0, 1, 4, 9, 16, 25, 36, 49, 64, 81);
    }
}