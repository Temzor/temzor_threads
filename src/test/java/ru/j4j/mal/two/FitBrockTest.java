package ru.j4j.mal.two;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class FitBrockTest {
    @Test
    void whenMan180Then70() {
        short input = 180;
        double expected = 70.42;
        double output = FitBrock.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then57() {
        short input = 170;
        double expected = 57.19;
        double output = FitBrock.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}