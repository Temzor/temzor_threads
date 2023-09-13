package ru.core.l2.collections.hashmap;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.core.l2.collections.arrayl.Car;

class CarHashMapTest {
    private CarMap map;

    @BeforeEach
    void setUp() {
        map = new CarMap();

    }

    @Test
    public void whenPut100ElementsThenSizeBecome100() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertThat(map.size()).isEqualTo(100);
    }

    @Test
    public void whenPut100ElementsWith10DifferentKeysThenSizeBecome10() {
        for (int i = 0; i < 100; i++) {
            int index = i % 10;
            CarOwner carOwner = new CarOwner(index, "Name" + index, "LastName" + index);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertThat(map.size()).isEqualTo(10);
    }

    @Test
    public void removeReturnTrueOnlyOnce() {
        for (int i = 0; i < 10; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertThat(map.size()).isEqualTo(10);

        CarOwner elementForDeleting = new CarOwner(5, "Name5", "LastName5");
        assertThat(map.remove(elementForDeleting)).isTrue();

        assertThat(map.size()).isEqualTo(9);
        assertThat(map.remove(elementForDeleting)).isFalse();
    }


    @Test
    public void countOfKeysMustBeEqualsToCountOfValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }
        assertThat(map.size()).isEqualTo(100);
        assertThat(map.keySet().size()).isEqualTo(100);
        assertThat(map.values().size()).isEqualTo(100);
    }

    @Test
    public void methodGetMustReturnRightValues() {
        for (int i = 0; i < 100; i++) {
            CarOwner carOwner = new CarOwner(i, "Name" + i, "LastName" + i);
            Car car = new Car("Brand" + i, i);
            map.put(carOwner, car);
        }

        CarOwner key = new CarOwner(50, "Name50", "LastName50");
        Car value = map.get(key);
        assertThat(value.getBrand()).isEqualTo("Brand50");
    }
}