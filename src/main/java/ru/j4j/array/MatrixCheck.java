package ru.j4j.array;

/**
 * Класс для проверки матриц на определенные выигрышные или одинаковые условия.
 */
public class MatrixCheck {

    /**
     * Проверяет, содержит ли ряд в матрице только непробельные символы.
     *
     * @param board матрица для проверки
     * @param row индекс ряда для проверки
     * @return true, если ряд заполнен, иначе false
     */
    public static boolean hasFilledRow(char[][] board, int row) {
        if (board == null || row < 0 || row >= board.length) {
            throw new IllegalArgumentException("Invalid board or row index");
        }
        for (char cell : board[row]) {
            if (cell == ' ') {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверяет, содержит ли столбец в матрице только непробельные символы.
     *
     * @param board матрица для проверки
     * @param column индекс столбца для проверки
     * @return true, если столбец заполнен, иначе false
     */
    public static boolean hasFilledColumn(char[][] board, int column) {
        if (board == null || column < 0 || board.length == 0 || column >= board[0].length) {
            throw new IllegalArgumentException("Invalid board or column index");
        }
        for (char[] row : board) {
            if (row[column] == ' ') {
                return false;
            }
        }
        return true;
    }

    /**
     * Извлекает диагональ из квадратной матрицы.
     *
     * @param board квадратная матрица для извлечения диагонали
     * @return массив, содержащий элементы диагонали
     */
    public static char[] extractDiagonal(char[][] board) {
        if (board == null || board.length == 0 || board.length != board[0].length) {
            throw new IllegalArgumentException("Invalid board");
        }
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }

    /**
     * Определяет выигрышное состояние в матрице.
     *
     * @param board матрица для проверки
     * @return true, если найден выигрышный ряд или столбец, иначе false
     */
    public static boolean isWin(char[][] board) {
        if (board == null || board.length == 0) {
            throw new IllegalArgumentException("Invalid board");
        }
        for (int i = 0; i < board.length; i++) {
            if (hasFilledRow(board, i) || hasFilledColumn(board, i)) {
                return true;
            }
        }
        return false;
    }
}