package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{14, 42, 15, 16, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[]{2, 6, 1, 16, 15, 42, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenArrayIsReversedThenCorrectOrder() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = Turn.back(array);
        assertThat(result).containsExactly(5, 4, 3, 2, 1);
    }

    @Test
    public void whenArrayWithEvenNumberOfElementsIsReversedThenCorrectOrder() {
        int[] array = {1, 2, 3, 4};
        int[] result = Turn.back(array);
        assertThat(result).containsExactly(4, 3, 2, 1);
    }

    @Test
    public void whenArrayHasSingleElementThenUnchanged() {
        int[] array = {1};
        int[] result = Turn.back(array);
        assertThat(result).containsExactly(1);
    }

    @Test
    public void whenArrayIsEmptyThenUnchanged() {
        int[] array = {};
        int[] result = Turn.back(array);
        assertThat(result).isEmpty();
    }

    @Test
    public void whenArrayWithIdenticalElementsThenSameOrder() {
        int[] array = {1, 1, 1, 1};
        int[] result = Turn.back(array);
        assertThat(result).containsExactly(1, 1, 1, 1);
    }

    @Test
    public void whenArrayWithNegativeElementsThenCorrectOrder() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] result = Turn.back(array);
        assertThat(result).containsExactly(-5, -4, -3, -2, -1);
    }
}