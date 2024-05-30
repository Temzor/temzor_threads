package ru.j4j.loop;

public class CheckPrimeNumber {

    /**
     * Checks if the given number is a prime number.
     * @param number the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean check(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
