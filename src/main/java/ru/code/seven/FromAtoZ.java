package ru.code.seven;

public class FromAtoZ {
    public static String letterSet(String diapason) {
        if (diapason.length() != 3) {
            throw new IllegalArgumentException("Start argument is >< 3 ");
        }

        if (diapason.charAt(0) == diapason.charAt(2)) {
            return String.valueOf(diapason.charAt(0));
        }
        StringBuilder stringBuilderResult = new StringBuilder();
        for (int i = diapason.charAt(0); i <= diapason.charAt(2); i++) {
            stringBuilderResult.append((char) i);
        }

        return stringBuilderResult.toString();
    }
}

