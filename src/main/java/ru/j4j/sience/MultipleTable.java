package ru.j4j.sience;

public class MultipleTable {
    public static void multiple(int size) {
        /*
        Проверка, начальное значение не должно быть меньше или равно нулю
         */
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        /*
        Цикл для вывода значений таблицы усножения в консоль
         */
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }

    /*
      Провека работы метода через метод main
     */
    public static void main(String[] args) {
        multiple(6);
    }
}
