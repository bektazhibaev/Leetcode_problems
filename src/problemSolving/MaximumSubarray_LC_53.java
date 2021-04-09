package problemSolving;

public class MaximumSubarray_LC_53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for(int i =1;i<nums.length;i++){
            if(current<0){
                current = nums[i];
            }else{
                current = current +nums[i];
            }
            max = Math.max(current,max);

        }
        return max;
    }

}
