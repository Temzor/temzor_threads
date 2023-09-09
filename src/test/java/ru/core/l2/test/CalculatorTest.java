package ru.core.l2.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void whenCalculatorThenConcatPlus() {
        assertThat(Calculator.concat(12, 42)).isEqualTo(54);
    }

    @Test
    void whenCalculatorThenConcatMinus() {
        assertThat(Calculator.concat(-18, -17)).isEqualTo(-35);
    }

    @Test
    void whenCalculatorThenConcatPlusString() {
        assertThat(Calculator.concat("12", "42")).isEqualTo(54);
    }

    @Test
    void whenCalculatorThenConcatMinusString() {
        assertThat(Calculator.concat("-18", "-17")).isEqualTo(-35);
    }

    @Test
    void whenCalculatorThenMinusPlus() {
        assertThat(Calculator.minus(44, 12)).isEqualTo(32);
    }

    @Test
    void whenCalculatorThenMinusMinus() {
        assertThat(Calculator.minus(-14, -28)).isEqualTo(14);
    }

    @Test
    void whenCalculatorThenMultiplyPlus() {
        assertThat(Calculator.multiply(24, 8)).isEqualTo(192);
    }

    @Test
    void whenCalculatorThenMultiplyMinus() {
        assertThat(Calculator.multiply(-35, 77)).isEqualTo(-2_695);
    }

    @Test
    void whenCalculatorThenDividedPlus() {
        assertThat(Calculator.divided(24, 8)).isEqualTo(3);
    }

    @Test
    void whenCalculatorThenDividedMinus() {
        assertThat(Calculator.divided(-44, 4)).isEqualTo(-11);
    }

}