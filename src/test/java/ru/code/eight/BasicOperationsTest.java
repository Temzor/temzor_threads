package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasicOperationsTest {
    @Test
            void basicOperations()
    {
        System.out.println("Basic Tests");
        assertThat(BasicOperations.basicMath("+", 4, 7).equals(11));
        assertThat(BasicOperations.basicMath("-", 15, 18).equals(-3));
        assertThat(BasicOperations.basicMath("*", 5, 5).equals(25));
        assertThat(BasicOperations.basicMath("/", 49, 7).equals(7));
    }

}