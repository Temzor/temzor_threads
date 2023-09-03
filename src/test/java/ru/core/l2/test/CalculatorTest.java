package ru.core.l2.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void whenCalculatorThenConcatPlus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.concat(12, 42)).isEqualTo(54);
    }

    @Test
    void whenCalculatorThenConcatMinus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.concat(-18, -17)).isEqualTo(-35);
    }

    @Test
    void whenCalculatorThenMinusPlus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.minus(44, 12)).isEqualTo(32);
    }

    @Test
    void whenCalculatorThenMinusMinus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.minus(-14, -28)).isEqualTo(14);
    }

    @Test
    void whenCalculatorThenMultiplyPlus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.multiply(24, 8)).isEqualTo(192);
    }

    @Test
    void whenCalculatorThenMultiplyMinus() {
        Calculator calculator = new Calculator();
        assertThat(calculator.multiply(-35, 77)).isEqualTo(-2_695);
    }
}