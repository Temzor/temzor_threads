package ru.core.l1.dog;

public class Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Bobik", "Ovsharka", 8);
        Dog secondDog = new Dog("Sharik", "Asian pudel", 3);
        Dog thirdDog = new Dog("Lana", "Doberman", 6);

        firstDog.run();
        secondDog.run();
        thirdDog.run();

        System.out.println(firstDog.info());
        System.out.println(secondDog.info());
        System.out.println(thirdDog.info());
    }
}
