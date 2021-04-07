package problemSolving;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode: Task 136 - Single Number.
 */

public class SingleNumber_LC_136 {

    public int singleNumber(int[] nums) {
        int n = 0;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {

            if (set.contains(i)) {
                n = n - i;
            } else {
                set.add(i);
                n = n + i;
            }
        }
        return n;
    }
}
