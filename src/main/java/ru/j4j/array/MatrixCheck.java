package ru.j4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] == ' ') {
                return false;
            }
        }
        return true;
    }
}