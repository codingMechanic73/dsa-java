package org.example.arrays.twoSum;

/**
 * Binary Search
 */
public class SearchInsertPosition {

    /**
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     */
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int searchInsertBruteForce(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
            i++;
        }
        return i;
    }
}