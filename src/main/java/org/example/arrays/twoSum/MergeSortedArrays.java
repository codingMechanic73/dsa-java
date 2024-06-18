package org.example.arrays.twoSum;

import java.util.Arrays;

public class MergeSortedArrays {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[n + m];

        int index1 = 0;
        int index2 = 0;
        int resultIndex = 0;

        while (index1 < m && index2 < n) {
            if (nums1[index1] < nums2[index2]) {
                result[resultIndex++] = nums1[index1++];
            } else {
                result[resultIndex++] = nums2[index2++];
            }
        }

        while (index1 < m) {
            result[resultIndex++] = nums1[index1++];
        }

        while (index2 < n) {
            result[resultIndex++] = nums2[index2++];
        }

        return result;
    }

    /**
     * Time Complexity: O(nLogn)
     * Space Complexity: O(n)
     */
    public static int[] mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            result[k++] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            result[k++] = nums2[i];
        }

        Arrays.sort(result);
        return result;
    }
}
