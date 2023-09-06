package ru.core.l2.collections.linkedl;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.arrayl.CarList;

class CarLinkedListTest {
    private CarList carList;

    @BeforeEach
    void setUp() {
        carList = new CarLinkedList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        assertThat(carList.size()).isEqualTo(100);
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        assertThat(carList.removeAt(10)).isTrue();
        assertThat(carList.size()).isEqualTo(99);
    }

    @Test
    public void whenElementRemovedByObjectThenSizeMustBeDecreased() {
        Car car = new Car("Lada", 1860019);
        carList.add(car);
        assertThat(carList.size()).isEqualTo(101);
        assertThat(carList.remove(car)).isTrue();
        assertThat(carList.size()).isEqualTo(100);
    }

    @Test
    public void whenNonExistentElementRemovedThenReturnFalse() {
        Car car = new Car("Lada", 1860019);
        assertThat(carList.remove(car)).isFalse();
        assertThat(carList.size()).isEqualTo(100);

    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        carList.clear();
        assertThat(carList.size()).isEqualTo(0);
    }

    @Test
    public void whenIndexOutOfBoundsThenThrowException() {
        assertThatThrownBy(() -> carList.get(100)).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void whenGetReturnRightValue() {
        Car car = carList.get(0);
        assertThat(car.getBrand()).isEqualTo("Brand0");
    }

    @Test
    public void insertIntoFirstPosition() {
        Car car = new Car("BMW", 1);
        carList.add(car, 0);
        Car carFromList = carList.get(0);
        assertThat(carFromList.getBrand()).isEqualTo(car.getBrand());
    }

    @Test
    public void insertIntoMiddle() {
        Car car = new Car("BMW", 1);
        carList.add(car, 50);
        Car carFromList = carList.get(50);
        assertThat(carFromList.getBrand()).isEqualTo(car.getBrand());
    }
    @Test
    public void insertIntoLastPosition() {
        Car car = new Car("BMW", 1);
        carList.add(car, 100);
        Car carFromList = carList.get(100);
        assertThat(carFromList.getBrand()).isEqualTo(car.getBrand());
    }
}