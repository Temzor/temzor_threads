package ru.j4j.sience;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Divider {
    /*
    Метод нахождения общих делителей массивов
     */
    public static List<Integer> findCommonDivisors(List<Integer> dividers) {
    /*
    Проверяем наименьшее число в массиве
     */
        int smallest = leastDivider(dividers);
        List<Integer> commonDivisors = findDivisors(smallest);

        /*
        Методом пербора всех чисел сверяем их делители
         */
        for (int number : dividers) {
            commonDivisors = intersectLists(commonDivisors, findDivisors(number));
        }

        return commonDivisors;
    }

    /*
    Метод для нахождения наименьшего делителя
     */
    private static int leastDivider(List<Integer> numbers) {
        int leastDivider = numbers.get(0);
        for (int number : numbers) {
            if (number < leastDivider) {
                leastDivider = number;
            }
        }
        return leastDivider;
    }

    /*
    Метод для нахождения делителей числа
     */
    private static List<Integer> findDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /*
    Метод для нахождения пересечений делителей двух массивов
     */
    private static List<Integer> intersectLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> intersection = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();

        for (int element : list1) {
            map.put(element, true);
        }

        for (int element : list2) {
            if (map.containsKey(element)) {
                intersection.add(element);
            }
        }

        return intersection;
    }

    /*
    Проверка решения
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(12);
        numbers.add(18);
        System.out.println("Common divisors: " + findCommonDivisors(numbers));
    }
}




