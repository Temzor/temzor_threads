package ru.j4j.ex;

public class FindEl {
    public static void indexOf(String[] values, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found");
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"16", "12", "18"}, "15");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
