package ru.yaone.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.yaone.model.Car;
import ru.yaone.model.enumeration.CarCondition;
import ru.yaone.services.CarService;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarServiceImplTest {

    private CarService carService;

    @BeforeEach
    void setUp() {
        carService = new CarServiceImpl();
    }

    @Test
    void testAddCar() {
        Car car = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        carService.addCar(car);
        List<Car> cars = carService.getAllCars();

        assertThat(cars).containsExactly(car);
    }

    @Test
    void testGetAllCars() {
        Car car1 = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        Car car2 = new Car(2, "Honda", "Civic", 2019, 18000, CarCondition.USED);
        carService.addCar(car1);
        carService.addCar(car2);

        List<Car> cars = carService.getAllCars();

        assertThat(cars).containsExactly(car1, car2);
    }

    @Test
    void testGetCarById() {
        Car car = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        carService.addCar(car);

        Car foundCar = carService.getCarById(1);

        assertThat(foundCar).isEqualTo(car);
    }

    @Test
    void testUpdateCar() {
        Car car = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        carService.addCar(car);

        Car updatedCar = new Car(1, "Toyota", "Camry", 2021, 25000, CarCondition.NEW);
        carService.updateCar(1, updatedCar);

        Car foundCar = carService.getCarById(1);

        assertThat(foundCar).isEqualTo(updatedCar);
    }

    @Test
    void testDeleteCar() {
        Car car = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        carService.addCar(car);

        carService.deleteCar(1);

        Car foundCar = carService.getCarById(1);
        assertThat(foundCar).isNull();
    }

    @Test
    void testSearchCars() {
        Car car1 = new Car(1, "Toyota", "Corolla", 2020, 20000, CarCondition.NEW);
        Car car2 = new Car(2, "Honda", "Civic", 2019, 18000, CarCondition.USED);
        carService.addCar(car1);
        carService.addCar(car2);

        List<Car> results = carService.searchCars("Toyota", "Corolla", 2020, 20000, CarCondition.NEW);

        assertThat(results).containsExactly(car1);
    }
}