package org.example.arrays.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArraysTest {

    @Test
    void merge() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] result = MergeSortedArrays.merge(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void mergeBruteForce() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] result = MergeSortedArrays.mergeBruteForce(nums1, 1, nums2, 0);
        Assertions.assertArrayEquals(new int[]{1}, result);
    }
}