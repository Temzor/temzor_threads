package ru.j4j.sience;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static ArrayList<Integer> checkPrime(int lowPrime, int highPrime) {
        /*
        Проверяем, что верхнее значение больше нижнего, иначе будет вызвано исключение
         */
        if (highPrime <= lowPrime) {
            throw new IllegalArgumentException("highPrime must be greater than or equal to lowPrime");
        }
        /*
        Создаем пустой массив для передачи значний простых чисел в диапазоне
         */
        ArrayList<Integer> primes = new ArrayList<>();
        /*
        Циклически проходим по диапозону для определения простых числе
         */
        for (int i = lowPrime; i <= highPrime; i++) {
            int finalI = i;
         /*
         Через stream определяем простое ли это число
         */
            if (IntStream.rangeClosed(2, i / 2).noneMatch(j -> finalI % j == 0)) {
                primes.add(i);
            }

        }
        return primes;
    }

   /*
      Провека работы метода через метод main
     */

    public static void main(String[] args) {
        ArrayList<Integer> testPrimes = checkPrime(11, 20);
        for (Integer prime : testPrimes) {
            System.out.println(prime);
        }
    }
}
