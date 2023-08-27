package ru.core.l1.temp;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;
        Object bicycle = new Bicycle();

        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
