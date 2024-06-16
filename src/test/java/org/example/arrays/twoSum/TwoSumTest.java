package org.example.arrays.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSumBruteForce() {
        int[] nums = {5, 4, 1, 3, 2};
        int[] result = TwoSum.twoSumBruteForce(nums, 4);
        Assertions.assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void twoSumSorted() {
        int[] nums = {5, 4, 1, 3, 2};
        int[] result = TwoSum.twoSumSorted(nums, 4);
        Assertions.assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void twoSumOptimized() {
        int[] nums = {5, 4, 1, 3, 2};
        int[] result = TwoSum.twoSumOptimized(nums, 4);
        Assertions.assertArrayEquals(new int[]{1, 3}, result);
    }
}