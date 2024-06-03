package ru.j4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MatrixCheckTest {

    @Test
    void testHasFilledRow() {
        char[][] board = {
                {'X', 'X', 'X'},
                {' ', 'X', 'X'},
                {'X', ' ', 'X'}
        };
        assertThat(MatrixCheck.hasFilledRow(board, 0)).isTrue();
        assertThat(MatrixCheck.hasFilledRow(board, 1)).isFalse();
        assertThat(MatrixCheck.hasFilledRow(board, 2)).isFalse();
    }

    @Test
    void testHasFilledColumn() {
        char[][] board = {
                {'X', 'X', ' '},
                {'X', ' ', 'X'},
                {'X', 'X', 'X'}
        };
        assertThat(MatrixCheck.hasFilledColumn(board, 0)).isTrue();
        assertThat(MatrixCheck.hasFilledColumn(board, 1)).isFalse();
        assertThat(MatrixCheck.hasFilledColumn(board, 2)).isFalse();
    }

    @Test
    void testExtractDiagonal() {
        char[][] board = {
                {'X', ' ', 'O'},
                {' ', 'X', ' '},
                {'O', ' ', 'X'}
        };
        char[] expectedDiagonal = {'X', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(board)).isEqualTo(expectedDiagonal);
    }

    @Test
    void testIsWin() {
        char[][] winningBoard = {
                {'X', 'X', 'X'},
                {' ', 'X', ' '},
                {'O', ' ', 'X'}
        };
        char[][] nonWinningBoard = {
                {'X', ' ', 'O'},
                {' ', 'X', ' '},
                {'O', ' ', ' '}
        };
        assertThat(MatrixCheck.isWin(winningBoard)).isTrue();
        assertThat(MatrixCheck.isWin(nonWinningBoard)).isFalse();
    }

    @Test
    void testHasFilledRowWithInvalidRow() {
        char[][] board = {
                {'X', 'X', 'X'},
                {' ', 'X', 'X'},
                {'X', ' ', 'X'}
        };
        assertThatThrownBy(() -> MatrixCheck.hasFilledRow(board, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid board or row index");

        assertThatThrownBy(() -> MatrixCheck.hasFilledRow(board, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid board or row index");
    }

    @Test
    void testHasFilledColumnWithInvalidColumn() {
        char[][] board = {
                {'X', 'X', 'X'},
                {' ', 'X', 'X'},
                {'X', ' ', 'X'}
        };
        assertThatThrownBy(() -> MatrixCheck.hasFilledColumn(board, -1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid board or column index");

        assertThatThrownBy(() -> MatrixCheck.hasFilledColumn(board, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid board or column index");
    }

    @Test
    void whenFilledRowThenHasFilledRowShouldReturnTrue() {
        char[][] input = new char[][]{
                {'X', 'X', 'X'},
                {' ', ' ', 'X'},
                {'X', ' ', 'X'}
        };
        assertThat(MatrixCheck.hasFilledRow(input, 0)).isTrue();
    }

    @Test
    void whenNotFilledRowThenHasFilledRowShouldReturnFalse() {
        char[][] input = new char[][]{
                {'X', ' ', 'X'},
                {' ', ' ', 'X'},
                {'X', 'X', 'X'}
        };
        assertThat(MatrixCheck.hasFilledRow(input, 0)).isFalse();
    }

    @Test
    void whenFilledColumnThenHasFilledColumnShouldReturnTrue() {
        char[][] input = new char[][]{
                {'X', ' ', 'X'},
                {'X', ' ', 'X'},
                {'X', ' ', ' '}
        };
        assertThat(MatrixCheck.hasFilledColumn(input, 0)).isTrue();
    }

    @Test
    void whenNotFilledColumnThenHasFilledColumnShouldReturnFalse() {
        char[][] input = new char[][]{
                {'X', ' ', 'X'},
                {' ', ' ', 'X'},
                {'X', ' ', 'X'}
        };
        assertThat(MatrixCheck.hasFilledColumn(input, 1)).isFalse();
    }

    @Test
    void whenExtractDiagonalThenShouldReturnCorrectDiagonal() {
        char[][] input = new char[][]{
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expected = {'X', 'X', 'X'};
        assertThat(MatrixCheck.extractDiagonal(input)).containsExactly(expected);
    }

    @Test
    void whenWinScenarioThenIsWinShouldReturnTrue() {
        char[][] input = new char[][]{
                {'X', 'X', 'X'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.isWin(input)).isTrue();
    }

    @Test
    void whenNoWinScenarioThenIsWinShouldReturnFalse() {
        char[][] input = new char[][]{
                {'X', ' ', 'X'},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        assertThat(MatrixCheck.isWin(input)).isFalse();
    }
}