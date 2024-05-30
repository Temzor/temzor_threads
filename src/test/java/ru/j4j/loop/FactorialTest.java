package ru.j4j.loop;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalc5Then120() {
        assertThat(120).isEqualTo(Factorial.calc(5));
    }

    @Test
    public void whenCalc0Then1() {
        assertThat(1).isEqualTo(Factorial.calc(0));
    }

    @Test
    public void whenCalc1Then1() {
        assertThat(1).isEqualTo(Factorial.calc(1));
    }

    @Test
    public void whenCalcNegativeThenException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> Factorial.calc(-1));
        assertThat("n must be non-negative").isEqualTo(exception.getMessage());
    }
}