package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {
    @Test
    public void when2on2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void when5on5() {
        int size = 5;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenSizeIs1() {
        int size = 1;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSizeIs2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSizeIs3() {
        int size = 3;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSizeIs4() {
        int size = 4;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSizeIs0() {
        int size = 0;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {};
        assertThat(result).isEqualTo(expected);
    }
}