package ru.core.l2.collections.set;

import ru.core.l2.collections.arrayl.Car;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>(Comparator.comparing(Car::getBrand));
        for (int i = 0; i < 100; i++) {
            cars.add(new Car("Brand" + i, i));
        }

        for (Car number : cars) {
            System.out.println(number);
        }
    }
}
