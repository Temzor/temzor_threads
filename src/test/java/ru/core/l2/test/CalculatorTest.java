package ru.core.l2.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public void setUpCalculator() {
        calculator = new Calculator();
    }

    @Test
    void whenCalculatorThenConcatPlus() {
        assertThat(calculator.concat(12, 42)).isEqualTo(54);
    }

    @Test
    void whenCalculatorThenConcatMinus() {
        assertThat(calculator.concat(-18, -17)).isEqualTo(-35);
    }

    @Test
    void whenCalculatorThenConcatPlusString() {
        assertThat(calculator.concat("12", "42")).isEqualTo(54);
    }

    @Test
    void whenCalculatorThenConcatMinusString() {
        assertThat(calculator.concat("-18", "-17")).isEqualTo(-35);
    }

    @Test
    void whenCalculatorThenMinusPlus() {
        assertThat(calculator.minus(44, 12)).isEqualTo(32);
    }

    @Test
    void whenCalculatorThenMinusMinus() {
        assertThat(calculator.minus(-14, -28)).isEqualTo(14);
    }

    @Test
    void whenCalculatorThenMultiplyPlus() {
        assertThat(calculator.multiply(24, 8)).isEqualTo(192);
    }

    @Test
    void whenCalculatorThenMultiplyMinus() {
        assertThat(calculator.multiply(-35, 77)).isEqualTo(-2_695);
    }

    @Test
    void whenCalculatorThenDividedPlus() {
        assertThat(calculator.divided(24, 8)).isEqualTo(3);
    }

    @Test
    void whenCalculatorThenDividedMinus() {
        assertThat(calculator.divided(-44, 4)).isEqualTo(-11);
    }

    @AfterAll
    public void close() {
        calculator = null;
    }
}