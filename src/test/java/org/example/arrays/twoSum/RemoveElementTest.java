package org.example.arrays.twoSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void removeElement() {
        int[] nums1 = {0,1,2,2,3,0,4,2};
        Assertions.assertEquals(5, RemoveElement.removeElement(nums1, 2));

        int[] nums2 = {3,2,2,3};
        Assertions.assertEquals(2, RemoveElement.removeElement(nums2, 3));
    }

    @Test
    void removeElementBruteForce() {
        int[] nums1 = {0,1,2,2,3,0,4,2};
        Assertions.assertEquals(5, RemoveElement.removeElementBruteForce(nums1, 2));

        int[] nums2 = {3,2,2,3};
        Assertions.assertEquals(2, RemoveElement.removeElementBruteForce(nums2, 3));
    }
}