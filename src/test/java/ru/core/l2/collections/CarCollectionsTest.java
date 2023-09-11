package ru.core.l2.collections;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.set.CarHashSet;

class CarCollectionsTest {
    private CarCollections carCollections;

    @BeforeEach
    void setUp() {
        carCollections = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carCollections.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void contains() {
        assertThat(carCollections.contains(new Car("Brand29", 29))).isTrue();
        assertThat(carCollections.contains(new Car("Brand200", 200))).isFalse();
    }

    @Test
    public void testForEach() {
        int index = 0;
        for (Car ignored : carCollections) {
            index++;
        }
        assertThat(index).isEqualTo(100);
    }
}