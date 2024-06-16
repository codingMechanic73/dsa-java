package org.example.arrays.twoSum;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Two Pointer
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int removeDuplicates(int[] nums) {
        int low = 0;
        for (int high = 1; high < nums.length; high++) {
            if (nums[low] != nums[high]) {
                nums[low + 1] = nums[high];
                low++;
            }
        }
        return low + 1;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int removeDuplicatesBruteForce(int[] nums) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        int index = 0;
        for(Integer uniqueEle: uniqueSet) {
            nums[index++] = uniqueEle;
        }
        return uniqueSet.size();
    }
}
