package ru.code.eight;


import java.util.Arrays;

public class Vector {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++, i++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}


