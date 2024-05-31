package ru.j4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortAlreadySorted() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWithDuplicates() {
        int[] data = new int[] {5, 3, 5, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 3, 5, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortSingleElement() {
        int[] data = new int[] {1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortEmptyArray() {
        int[] data = new int[] {};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {};
        assertThat(result).containsExactly(expected);
    }
}