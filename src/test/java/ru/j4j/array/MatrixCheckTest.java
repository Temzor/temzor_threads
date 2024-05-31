package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoHorizontalNotFullRowTwo() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', ' '}
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoHorizontalNotFullRowOne() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result).isFalse();
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'X'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMonoHorizontalTrue() {
        char[][] board = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoHorizontal(board, 0);
        assertThat(result).isTrue();
    }

    @Test
    public void whenMonoHorizontalFalse() {
        char[][] board = {
                {'X', 'X', ' '},
                {' ', 'X', ' '},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoHorizontal(board, 0);
        assertThat(result).isFalse();
    }

    @Test
    public void whenMonoVerticalTrue() {
        char[][] board = {
                {'X', ' ', 'X'},
                {'X', ' ', 'X'},
                {'X', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(board, 2);
        assertThat(result).isTrue();
    }

    @Test
    public void whenMonoVerticalFalse() {
        char[][] board = {
                {'X', 'X', ' '},
                {'X', ' ', 'X'},
                {' ', 'X', ' '}
        };
        boolean result = MatrixCheck.monoVertical(board, 0);
        assertThat(result).isFalse();
    }

    @Test
    public void whenExtractDiagonal() {
        char[][] board = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] result = MatrixCheck.extractDiagonal(board);
        char[] expected = {'X', 'X', 'X'};
        assertThat(result).isEqualTo(expected);
    }
}
