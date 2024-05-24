package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesTwoTest {
    @Test
    void removeDuplicates() {
        assertThat(9).isEqualTo(RemoveDuplicatesTwo.removeDuplicatesTwo(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}