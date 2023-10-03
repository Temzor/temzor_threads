package ru.j4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                return false;
            }
        }
        return true;
    }
}
