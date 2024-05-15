package ru.code.eight;

public class SumArrays {
    /**
     * Summary
     * The arrayPlusArray method takes two integer arrays as input and returns the sum of all the elements in both arrays.
     * Example Usage
     * int[] arr1 = {1, 2, 3};
     * int[] arr2 = {4, 5, 6};
     * int result = SumArrays.arrayPlusArray(arr1, arr2);
     * System.out.println(result); // Output: 21
     * Code Analysis
     * Inputs
     * arr1: an integer array
     * arr2: an integer array
     *
     * Flow
     * Initialize two variables a and b to 0.
     * Iterate over each element j in arr1 and add it to a.
     * Iterate over each element j in arr2 and add it to b.
     * Return the sum of a and b.
     *
     * Outputs
     * The sum of all the elements in arr1 and arr2.
     */
    /**
     * @param arr1
     * @param arr2
     * @return
     */
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int a = 0;
        int b = 0;
        for (int j : arr1) {
            a += j;
        }
        for (int j : arr2) {
            b += j;
        }
        return a + b;
    }
}
