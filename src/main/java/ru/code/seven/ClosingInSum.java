package ru.code.seven;

public class ClosingInSum {
    public static int closingInSum(long n) {
        String[] stringsSplit = Long.toString(n).split("");
        int result = 0;
        int reverseCounter = stringsSplit.length;
        for (int i = 0; i < reverseCounter; i++) {
            if (i == reverseCounter - 1) {
                result += Integer.parseInt(stringsSplit[i]);
            } else {
                result += Integer.parseInt(stringsSplit[i] + stringsSplit[reverseCounter - 1]);
                reverseCounter--;
            }
        }
        return result;
    }
}
