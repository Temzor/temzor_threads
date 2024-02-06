package ru.code.seven;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {
    @Test
    void sampleTests() {
        assertThat(1).isEqualTo(Fibonacci.fib(1));
        assertThat(1).isEqualTo(Fibonacci.fib(2));
        assertThat(2).isEqualTo(Fibonacci.fib(3));
        assertThat(3).isEqualTo(Fibonacci.fib(4));
        assertThat(5).isEqualTo(Fibonacci.fib(5));
    }
}