package org.example.arrays.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MoveZerosTest {
    @Test
    void moveZeroes() {
        int[] nums1 = {0, 1, 0, 3, 12};
        MoveZeros.moveZeroes(nums1);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums1);

        int[] nums2 = {1, 2, 0, 4, 3, 0, 5, 0};
        MoveZeros.moveZeroes(nums2);
        Assertions.assertArrayEquals(new int[]{1, 2, 4, 3, 5, 0, 0, 0}, nums2);

        int[] nums3 = {1, 2, 0, 0, 0, 3, 6};
        MoveZeros.moveZeroes(nums3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 6, 0, 0, 0}, nums3);
    }

    @Test
    void moveZeroesBruteForce() {
        int[] nums1 = {0, 1, 0, 3, 12};
        MoveZeros.moveZerosBruteForce(nums1);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums1);

        int[] nums2 = {1, 2, 0, 4, 3, 0, 5, 0};
        MoveZeros.moveZerosBruteForce(nums2);
        Assertions.assertArrayEquals(new int[]{1, 2, 4, 3, 5, 0, 0, 0}, nums2);

        int[] nums3 = {1, 2, 0, 0, 0, 3, 6};
        MoveZeros.moveZerosBruteForce(nums3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 6, 0, 0, 0}, nums3);
    }
}