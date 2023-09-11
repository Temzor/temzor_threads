package ru.core.l2.collections.iterable;

import ru.core.l2.collections.CarCollections;
import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.arrayl.CarArrayList;

public class Main {
    public static void main(String[] args) {
        CarCollections cars = new CarArrayList();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car("Brand" + i, i));
        }

        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getVin());
        }
    }
}
