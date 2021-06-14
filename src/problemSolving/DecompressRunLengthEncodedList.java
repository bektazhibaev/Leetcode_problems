package problemSolving;

import java.util.ArrayList;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
//        for (int i: nums){
//            list.add(i);
//        }

        for (int i = 0; i < nums.length-1; i=i+2){

            for (int j = 1; j <= nums[i]; j++){

                list.add(nums[i+1]);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
