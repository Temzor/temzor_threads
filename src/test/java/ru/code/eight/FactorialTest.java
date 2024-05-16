package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void testFactorial() {
        assertThat(2).isEqualTo(Factorial.factorial(2));
        assertThat(6).isEqualTo(Factorial.factorial(3));
        assertThat(1).isEqualTo(Factorial.factorial(1));
    }
}