package org.example.arrays.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{nums[map.get(nums[i])], nums[i]};
            } else {
                map.put(target - nums[i], i);
            }
        }
        throw new RuntimeException("No Solution Found!");
    }


    /**
     * Time complexity O(n Logn)
     * Space complexity O(n)
     */
    public static int[] twoSumSorted(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] + nums[high] == target) {
                return new int[]{nums[low], nums[high]};
            } else if (nums[low] + nums[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        throw new RuntimeException("No Solution Found!");
    }

    /**
     * Time Complexity O(n^2)
     * Space Complexity O(1)
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        throw new RuntimeException("No Solution Found!");
    }
}
