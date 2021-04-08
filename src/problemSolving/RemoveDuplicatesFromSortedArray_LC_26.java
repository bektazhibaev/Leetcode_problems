package problemSolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode: 26 - Remove Duplicates From Sorted Array.
 * @btazhibaev solution.
 */

public class RemoveDuplicatesFromSortedArray_LC_26 {

    public void removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){

            }else {
                set.add(nums[i]);
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
