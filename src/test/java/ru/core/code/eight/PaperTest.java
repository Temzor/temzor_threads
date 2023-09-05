package ru.core.code.eight;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaperTest {
    @Test
    public void whenFiveToFivePositiveTwentyFive() {
        assertThat(Paper.paperWork(5, 5)).isEqualTo(25);
    }

    @Test
    public void whenZeroToFiveNegativeTwentyZero() {
        assertThat(Paper.paperWork(0, 5)).isEqualTo(0);
    }

    @Test
    public void whenZeroToZeroNegativeZero() {
        assertThat(Paper.paperWork(0, 0)).isEqualTo(0);
    }

    @Test
    public void whenMinusFiveToMinusTenNegativeZero() {
        assertThat(Paper.paperWork(-5, -10)).isEqualTo(0);
    }

}