package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeSortedArrayTest {

    @Test
    public void whenMergeTwoSortedArrays_thenCorrect() {
        MergeSortedArray merger = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] result = merger.merge(nums1, m, nums2, n);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenNums2IsEmpty_thenNums1RemainsUnchanged() {
        MergeSortedArray merger = new MergeSortedArray();
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1, 2, 3};
        int[] result = merger.merge(nums1, m, nums2, n);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenNums1IsEmpty_thenNums2CopiedToNums1() {
        MergeSortedArray merger = new MergeSortedArray();
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {2, 5, 6};
        int[] result = merger.merge(nums1, m, nums2, n);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBothArraysEmpty_thenResultIsEmpty() {
        MergeSortedArray merger = new MergeSortedArray();
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {};
        int[] result = merger.merge(nums1, m, nums2, n);
        assertThat(result).containsExactly(expected);
    }
}