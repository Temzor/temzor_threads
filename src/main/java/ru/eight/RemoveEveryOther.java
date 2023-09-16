package ru.eight;

public class RemoveEveryOther {
    public static Object[] removeEveryOther(Object[] array) {
        Object[] result = new Object[(array.length + 1) / 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i * 2];
        }
        return result;
    }
}
