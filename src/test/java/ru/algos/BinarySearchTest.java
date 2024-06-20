package ru.algos;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void testSearchFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        int result = binarySearch.search(arr, target);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void testSearchNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int result = binarySearch.search(arr, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void testSearchEmptyArray() {
        int[] arr = {};
        int target = 1;
        int result = binarySearch.search(arr, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void testSearchSingleElementFound() {
        int[] arr = {5};
        int target = 5;
        int result = binarySearch.search(arr, target);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testSearchSingleElementNotFound() {
        int[] arr = {5};
        int target = 3;
        int result = binarySearch.search(arr, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void testSearchNullArray() {
        int target = 1;
        assertThatThrownBy(() -> binarySearch.search(null, target))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Array must not be null");
    }
}