package ru.j4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenArrayHasTwoElementsThenSwap() {
        int[] array = {1, 2};
        int[] result = SwitchArray.swap(array);
        assertThat(result).containsExactly(2, 1);
    }

    @Test
    public void whenArrayHasThreeElementsThenSwapFirstAndLast() {
        int[] array = {1, 2, 3};
        int[] result = SwitchArray.swap(array);
        assertThat(result).containsExactly(3, 2, 1);
    }

    @Test
    public void whenArrayHasFourElementsThenSwapFirstAndLast() {
        int[] array = {1, 2, 3, 4};
        int[] result = SwitchArray.swap(array);
        assertThat(result).containsExactly(4, 2, 3, 1);
    }

    @Test
    public void whenArrayHasOneElementThenNoChange() {
        int[] array = {1};
        int[] result = SwitchArray.swap(array);
        assertThat(result).containsExactly(1);
    }

    @Test
    public void whenArrayIsEmptyThenNoChange() {
        int[] array = {};
        int[] result = SwitchArray.swap(array);
        assertThat(result).isEmpty();
    }
}