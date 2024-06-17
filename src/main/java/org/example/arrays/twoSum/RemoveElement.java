package org.example.arrays.twoSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Two Pointer
 */
public class RemoveElement {


    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int removeElement(int[] nums, int val) {
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            if (nums[high] != val) {
                nums[low] = nums[high];
                low++;
            }
            high++;
        }
        return low;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int removeElementBruteForce(int[] nums, int val) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                result.add(num);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            nums[i] = result.get(i);
        }
        return result.size();
    }
}
