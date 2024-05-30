package ru.j4j.loop;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FitnessTest {
    @Test
    void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenIvan50Nik90Then3() {
        assertThat(2).isEqualTo(Fitness.calc(50, 90));
    }

    @Test
    public void whenIvan90Nik90Then1() {
        assertThat(1).isEqualTo(Fitness.calc(90, 90));
    }

    @Test
    public void whenIvan100Nik50Then0() {
        assertThat(0).isEqualTo(Fitness.calc(100, 50));
    }

    @Test
    public void whenNegativeStrengthThenException() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> Fitness.calc(-50, 90));
        assertThat("Strength values must be non-negative").isEqualTo(exception.getMessage());
    }
}
