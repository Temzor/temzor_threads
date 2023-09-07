package ru.core.l2.collections.linkedl;

import ru.core.l2.collections.arrayl.Car;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("BMW", 1);
        Car secondCar = new Car("BMW", 1);
        System.out.println(firstCar == secondCar);
        System.out.println(firstCar.equals(secondCar));
    }
}
