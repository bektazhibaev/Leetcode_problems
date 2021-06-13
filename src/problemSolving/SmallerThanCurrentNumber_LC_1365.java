package problemSolving;

import java.util.Arrays;

public class SmallerThanCurrentNumber_LC_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int arr[] = new int[nums.length];

//        for (int i = 0; i < nums.length; i++){
//            int count = 0;
//            for (int j = 0; j < nums.length; j++){
//                if(nums[i] > nums[j] && i != j){
//                    count++;
//                }
//            }
//            arr[i] = count;
//        }

        Arrays.sort(nums);
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){

            }
            else {
                count++;
            }
        }
        return arr;
    }
}
