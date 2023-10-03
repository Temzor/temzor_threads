package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortSelectedTest {
    @Test
    public void whenSort5Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5ElementsToo() {
        int[] data = new int[] {10, 6, 0, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 6, 10};
        assertThat(result).containsExactly(expected);
    }
}