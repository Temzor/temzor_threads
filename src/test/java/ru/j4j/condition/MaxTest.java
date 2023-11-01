package ru.j4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {
    @Test
    void whenFirstMoreSecondThenReturnFirst() {
        assertThat(Max.max(4, 2)).isEqualTo(4);
    }

    @Test
    void whenSecondMoreFirstThenReturnSecond() {
        assertThat(Max.max(3, 7)).isEqualTo(7);
    }

    @Test
    void whenFirstISEqualsSecondThenReturnFirst() {
        assertThat(Max.max(5, 1)).isEqualTo(5);
    }

    @Test
    void testThreeComponent() {
        assertThat(Max.max(5, 1, 16)).isEqualTo(16);
    }

    @Test
    void testFourComponent() {
        assertThat(Max.max(5, 1, 16, 25)).isEqualTo(25);
    }
}