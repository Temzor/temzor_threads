package ru.core.l2.collections;

public class Car {
    private final String brand;
    private final int vin;

    public Car(String brand, int vin) {
        this.brand = brand;
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public int getVin() {
        return vin;
    }
}
