package ru.core.l2.collections;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.linkedl.CarLinkedList;

class CarCollectionsTest {
    private CarCollections carCollections;

    @BeforeEach
    void setUp() {
        carCollections = new CarLinkedList();
        for (int i = 0; i < 100; i++) {
            carCollections.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contains() {
        assertThat(carCollections.contains(new Car("Brand29", 29))).isTrue();
        assertThat(carCollections.contains(new Car("Brand200", 200))).isFalse();
    }
}