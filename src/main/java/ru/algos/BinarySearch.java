package ru.algos;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int counter = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println(counter);
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