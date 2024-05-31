package ru.j4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwapFirstAndLastThenArrayIsSwapped() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = SwitchArray.swap(array, 0, array.length - 1);
        assertThat(result).containsExactly(5, 2, 3, 4, 1);
    }

    @Test
    public void whenSwapMiddleElementsThenArrayIsSwapped() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = SwitchArray.swap(array, 1, 3);
        assertThat(result).containsExactly(1, 4, 3, 2, 5);
    }

    @Test
    public void whenSwapSameElementThenArrayUnchanged() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = SwitchArray.swap(array, 2, 2);
        assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }

    @Test
    public void whenSwapBorderThenFirstAndLastElementsAreSwapped() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = SwitchArray.swapBorder(array);
        assertThat(result).containsExactly(5, 2, 3, 4, 1);
    }

    @Test
    public void whenSwapBorderSingleElementArrayThenArrayUnchanged() {
        int[] array = {1};
        int[] result = SwitchArray.swapBorder(array);
        assertThat(result).containsExactly(1);
    }

    @Test
    public void whenSwapBorderEmptyArrayThenArrayUnchanged() {
        int[] array = {};
        int[] result = SwitchArray.swapBorder(array);
        assertThat(result).isEmpty();
    }

    @Test
    public void whenSwapInvalidIndicesThenThrowException() {
        int[] array = {1, 2, 3, 4, 5};
        try {
            SwitchArray.swap(array, 0, 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class)
                    .hasMessageContaining("Index 10 out of bounds for length 5");
        }
    }
}