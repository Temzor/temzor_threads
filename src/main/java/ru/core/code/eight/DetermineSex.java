package ru.core.code.eight;

public class DetermineSex {
    public static String chromosomeCheck(String sperm) {
        return sperm.equals("XX") ? "Congratulations! You're going to have a son."
                : "Congratulations! You're going to have a daughter.";
    }
}
