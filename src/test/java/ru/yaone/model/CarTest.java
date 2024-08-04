package ru.yaone.model;

import org.junit.jupiter.api.Test;
import ru.yaone.model.enumeration.CarCondition;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void testCarCreation() {
        Car car = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);

        assertThat(car.id()).isEqualTo(1);
        assertThat(car.make()).isEqualTo("Toyota");
        assertThat(car.model()).isEqualTo("Corolla");
        assertThat(car.year()).isEqualTo(2020);
        assertThat(car.price()).isEqualTo(20000);
        assertThat(car.condition()).isEqualTo(CarCondition.NEW);
    }

    @Test
    void testCarEquality() {
        Car car1 = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        Car car2 = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);

        assertThat(car1).isEqualTo(car2);
    }

    @Test
    void testCarInequality() {
        Car car1 = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        Car car2 = new Car(2, "Honda", "Civic", 2019, 18000, CarCondition.USED);

        assertThat(car1).isNotEqualTo(car2);
    }
}