package ru.algos;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    @Test
    void testBinarySearchFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 3;
        int result = binarySearch.binarySearch(arr, target);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void testBinarySearchNotFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 11;
        int result = binarySearch.binarySearch(arr, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void testBinarySearchEmptyArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {};
        int target = 1;
        int result = binarySearch.binarySearch(arr, target);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void testBinarySearchSingleElementFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {5};
        int target = 5;
        int result = binarySearch.binarySearch(arr, target);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testBinarySearchSingleElementNotFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {5};
        int target = 3;
        int result = binarySearch.binarySearch(arr, target);
        assertThat(result).isEqualTo(-1);
    }
}