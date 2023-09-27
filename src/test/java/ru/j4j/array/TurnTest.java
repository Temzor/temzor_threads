package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {14, 42, 15, 16, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 16, 15, 42, 14};
        assertThat(result).containsExactly(expected);
    }
}