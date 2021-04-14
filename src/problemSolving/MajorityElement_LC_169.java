package problemSolving;

import java.util.HashSet;
import java.util.Set;

public class MajorityElement_LC_169 {

    public int majorityElement(int[] nums){
        int res = 0;
        int max = 0;
        int count;
        Set<Integer> set = new HashSet<>();
        for (int a: nums){
            set.add(a);
        }

        for (int i: set){
            count = 0;
            for (int j = 0; j < nums.length; j++){
                if(i == nums[j]){
                    count++;
                    if(count > max){
                        max = count;
                        res = i;
                    }
                }
            }
        }

        return res;
    }
}
