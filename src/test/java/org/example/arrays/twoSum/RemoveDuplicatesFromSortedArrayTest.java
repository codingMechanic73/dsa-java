package org.example.arrays.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicatesBruteForce() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = RemoveDuplicatesFromSortedArray.removeDuplicatesBruteForce(nums);
        Assertions.assertEquals(5, result);
    }

    @Test
    void removeDuplicatesOptimized() {
        int[] nums1 = {1, 1, 2};
        int result1 = RemoveDuplicatesFromSortedArray.removeDuplicates(nums1);
        Assertions.assertEquals(2, result1);

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result2 = RemoveDuplicatesFromSortedArray.removeDuplicates(nums2);
        Assertions.assertEquals(5, result2);
    }
}