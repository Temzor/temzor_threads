package ru.j4j.fit;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FitTest {
    @Test
    public void manWeightTest() {
        assertThat(Fit.manWeight(184)).isEqualTo(96.6f);
    }

    @Test
    public void womanWeightTest() {
        assertThat(Fit.womanWeight(169)).isEqualTo(67.85f);
    }

}