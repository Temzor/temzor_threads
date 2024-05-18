package ru.code.eight;

public class WellOfIdeas {
    public static String well(String[] x) {
        int countBad = 0;
        int countGood = 0;
        for (String s : x) {
            if (s.equals("bad")) {
                countBad++;
            } else if (s.equals("good")) {
                countGood++;
            }
        }
        return countBad > 0 && countGood == 0 ? "Fail!" : countGood >= 2 ? "I smell a series!" : "Publish!";
    }
}
