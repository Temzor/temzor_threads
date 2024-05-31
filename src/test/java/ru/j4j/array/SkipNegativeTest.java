package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenArrayRow4AndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenAllPositive() {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] result = SkipNegative.skip(input);
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenContainsNegative() {
        int[][] input = {
                {1, -2, 3},
                {4, -5, 6}
        };
        int[][] result = SkipNegative.skip(input);
        int[][] expected = {
                {1, 0, 3},
                {4, 0, 6}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAllNegative() {
        int[][] input = {
                {-1, -2, -3},
                {-4, -5, -6}
        };
        int[][] result = SkipNegative.skip(input);
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMixed() {
        int[][] input = {
                {1, -2, 3},
                {-4, 0, 6},
                {7, -8, -9}
        };
        int[][] result = SkipNegative.skip(input);
        int[][] expected = {
                {1, 0, 3},
                {0, 0, 6},
                {7, 0, 0}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenEmpty() {
        int[][] input = {};
        int[][] result = SkipNegative.skip(input);
        int[][] expected = {};
        assertThat(result).isEqualTo(expected);
    }
}
