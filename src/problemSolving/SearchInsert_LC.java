package problemSolving;

public class SearchInsert_LC {

    public int searchInsert(int[] nums, int target) {
        int r = -1;
        if(nums.length == 1 && nums[0] > target){
            return 0;
        }
        if(nums.length == 1 && nums[0] < target){
            return 1;
        }
        if(nums.length == 1 && nums[0] == target){
            return 0;
        }
        if(target < nums[0]){
            return 0;
        }
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i] == target){
                return i;
            }
            else if(nums[i+1] == target){
                return i+1;
            }
            else{
                if(target > nums[i] && target < nums[i+1]){
                    r = i+1;
                }
            }
        }
        if(r == -1){
            r = nums.length;
        }
        return r;
    }
}
