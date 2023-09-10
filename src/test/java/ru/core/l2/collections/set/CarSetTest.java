package ru.core.l2.collections.set;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.core.l2.collections.arrayl.Car;

class CarSetTest {
    private CarSet carSet;

    @BeforeEach
    void setUp() {
        carSet = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand" + i, i));
        }
    }

    @Test
    void whenDuplicateThreeSimilarElementsThenNoDuplicatesInSetIsTrue() {
        assertThat(carSet.size()).isEqualTo(100);
        assertThat(carSet.add(new Car("BMW", 1212))).isTrue();
        assertThat(carSet.add(new Car("BMW", 1212))).isFalse();
        assertThat(carSet.add(new Car("BMW", 1212))).isFalse();
        assertThat(carSet.size()).isEqualTo(101);
    }

    @Test
    void whenClearSetThenClearAllSElements() {
        carSet.clear();
        assertThat(carSet.size()).isEqualTo(0);
    }

    @Test
    void whenRemoveElementsThenTrue() {
        assertThat(carSet.remove(new Car("Brand30", 30))).isTrue();
        assertThat(carSet.remove(new Car("Brand30", 30))).isFalse();
        assertThat(carSet.size()).isEqualTo(99);
    }
}
