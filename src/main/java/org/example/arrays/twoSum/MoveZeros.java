package org.example.arrays.twoSum;

/**
 * Two Pointer
 */
public class MoveZeros {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void moveZeroes(int[] nums) {
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            if (nums[high] != 0) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
            }
            high++;
        }
    }

    /**
     * Time Complexity: O(n ^ 2)
     * Space Complexity: O(1)
     */
    public static void moveZerosBruteForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int j = i + 1;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j == nums.length) {
                    break;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }


}
