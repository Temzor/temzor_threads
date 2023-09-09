package ru.core.code.eight;

public class RemoveEveryOther {
    public static Object[] removeEveryOther(Object[] array) {
        if (array.length == 0) {
            return array;
        }
        Object[] result = new Object[array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1];
        result[0] = array[0];
        int j = 2;
        for (int i = 1; i < result.length; i++) {
            result[i] = array[j];
            j += 2;
        }
        return result;
    }
}
