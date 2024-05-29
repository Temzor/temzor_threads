package ru.j4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class FitTest {

    @Test
    public void whenManHeight187ThenWeight100Dot05() {
        short heightMan = 187;
        double expected = 100.05;
        double result = Fit.manWeight(heightMan);
        assertThat(expected).isEqualTo(result, offset(0.01));
    }

    @Test
    public void whenWomanHeight170ThenWeight69Dot00() {
        short heightWoman = 170;
        double expected = 69.00;
        double result = Fit.womanWeight(heightWoman);
        assertThat(expected).isEqualTo(result, offset(0.01));
    }

}