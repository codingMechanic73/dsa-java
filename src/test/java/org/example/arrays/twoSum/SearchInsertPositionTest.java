package org.example.arrays.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        int[] nums1 = {1, 3, 5, 6};
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums1, 5), 2);

        int[] nums2 = {1, 3, 5, 6};
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums2, 2), 1);

        int[] nums3 = {1, 3, 5, 6};
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums3, 7), 4);
    }
    @Test
    void searchInsertBruteForce() {
        int[] nums1 = {1, 3, 5, 6};
        Assertions.assertEquals(SearchInsertPosition.searchInsertBruteForce(nums1, 5), 2);

        int[] nums2 = {1, 3, 5, 6};
        Assertions.assertEquals(SearchInsertPosition.searchInsertBruteForce(nums2, 2), 1);

        int[] nums3 = {1, 3, 5, 6};
        Assertions.assertEquals(SearchInsertPosition.searchInsertBruteForce(nums3, 7), 4);
    }
}