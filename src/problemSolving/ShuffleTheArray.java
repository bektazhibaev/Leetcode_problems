package problemSolving;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        //{1,2,3,4,5,6} -> {1,4,2,5,3,6}

        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0, j = n; i < nums.length/2 && j < nums.length; i++, j++){
            res[count] = nums[i];
            res[count + 1] = nums[j];
            count += 2;
        }
        return res;
    }
}
