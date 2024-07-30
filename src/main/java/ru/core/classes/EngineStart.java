package ru.core.classes;

public class EngineStart {
    public static void main(String[] args) {
        StaticNestedClassCar.Engine engine = new StaticNestedClassCar.Engine(500);
        StaticNestedClassCar car = new StaticNestedClassCar("blue", "bugatti", engine, 6000);
        System.out.println(engine);
        System.out.println(car);

    }
}
