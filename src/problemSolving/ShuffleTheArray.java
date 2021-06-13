package problemSolving;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        //{1,2,3,4,5,6,7} -> {1,4,2,5,3,6,7}
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){

            for (int j = i; j < nums.length-1; j++){
                res[i] = nums[i];
                res[i+1] = nums[j+n];
                i++;
            }
        }
        return res;
    }
}
