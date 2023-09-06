package ru.core.l2.collections;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.arrayl.CarLast;
import ru.core.l2.collections.arrayl.CarList;

class CarLastTest {

    private CarList carList;

    @BeforeEach
    void setUp() {
        carList = new CarLast();
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
        assertThatThrownBy(() -> carList.get(100)).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void whenGetReturnRightValue() {
        Car car = carList.get(0);
        assertThat(car.getBrand()).isEqualTo("Brand0");
    }
}