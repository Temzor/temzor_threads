package ru.algos;

public class BinarySearch {

    /**
     * Performs a binary search on a sorted array.
     *
     * @param arr    the sorted array to search
     * @param target the value to search for
     * @return the index of the target value if found, otherwise -1
     */
    public int search(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}