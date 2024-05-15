package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasicOperationsTest {
    @Test
    void basicOperations() {
        System.out.println("Basic Tests");
        assertThat(11).isEqualTo(BasicOperations.basicMath("+", 4, 7));
        assertThat(-3).isEqualTo(BasicOperations.basicMath("-", 15, 18));
        assertThat(25).isEqualTo(BasicOperations.basicMath("-", 40, 15));
        assertThat(7).isEqualTo(BasicOperations.basicMath("/", 49, 7));
    }
}