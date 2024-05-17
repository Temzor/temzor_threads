package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EvenNumbersTest {
    @Test
    void testEvenNumbers() {
        assertThat(new int[]{2, 4, 6}).isEqualTo(EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 2));
        assertThat(new int[]{3, 6}).isEqualTo(EvenNumbers.divisibleBy(new int[]{1, 2, 3, 4, 5, 6}, 3));
        assertThat(new int[]{0, 4}).isEqualTo(EvenNumbers.divisibleBy(new int[]{0, 1, 2, 3, 4, 5, 6}, 4));
    }
}