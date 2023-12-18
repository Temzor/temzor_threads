package ru.core.l2.collections.arrayl;

import java.util.Objects;

public class Car implements Comparable<Car> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return vin == car.vin && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, vin);
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(vin, o.vin);
    }

    @Override
    public String toString() {
        return String.format("Car(brand=%s ,vin=%s)",
                this.brand,
                this.vin);
    }
}
