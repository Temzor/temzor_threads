package ru.j4j.sience;

public class TwoElementBroken {
    public static int experiment(int heightNoBroken) {
        int height = 5000;
        int counter = 0;
        int delta = 0;


        if (heightNoBroken < 0 || heightNoBroken > height) {
            throw new IllegalArgumentException("Height must be between 0 and 5000");
        }

        for (int i = 1; i <= height; i += 50) {
            if (i > heightNoBroken) {
                delta = i;
                counter++;
                break;
            } else if (i == heightNoBroken) {
                return counter;
            }
            counter++;
        }

        for (int i = delta; i <= delta + 50; i++) {
                if (i < heightNoBroken) {
                    counter++;
                } else if (i == heightNoBroken) {
                    return counter;
                }
            }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(experiment(4954));
    }
}
