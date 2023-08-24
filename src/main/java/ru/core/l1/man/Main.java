package ru.core.l1.man;

public class Main {
    public static void main(String[] args) {
        Man[] mans = new Man[5];
        Man firstMan = new Man("Ivan", 22, 78.3F);
        Man secondMan = new Man("Petr", 46, 98.1F);
        Man thirdMan = new Man("Dmitrii", 34, 97.8F);
        Man fourthMan = new Man("Boris", 30, 60.2F);
        Man fivethMan = new Man("Dan", 19, 53.7F);

        mans[0] = firstMan;
        mans[1] = secondMan;
        mans[2] = thirdMan;
        mans[3] = fourthMan;
        mans[4] = fivethMan;

        for (Man man : mans) {
            System.out.println(man);
        }

        System.out.println("Middle ages all mens: " + (firstMan.getAge() + secondMan.getAge() + thirdMan.getAge()
                + fourthMan.getAge() + fivethMan.getAge()) / mans.length);

    }
}
