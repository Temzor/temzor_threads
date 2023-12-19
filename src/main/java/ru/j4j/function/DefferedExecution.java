package ru.j4j.function;

import java.util.Arrays;
import java.util.Comparator;

public class DefferedExecution {
    public static void main(String[] args) {
        /*
          Comparator не будет вызван, т.к. для работы comparator необходимо 2-а элемента,
          т.е. компаратор вызван не будет, пока не появится элемент для сравнения
          это и есть отложенное исполнение
         */
        String[] names = {
                "Ivan",
        };
        Comparator<String> lengthComparator = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthComparator);

        /*
          Comparator будет вызван, т.к. есть 2-а элемента, которые можно сравнить
          это и есть отложенное исполнение
         */
        String[] strings = {
                "Ivan",
                "Petr"
        };
        Comparator<String> executeComparator = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(strings, executeComparator);
    }
}
