package problemSolving;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber_LC_179 {

    public String largestNumber(int[] nums) {

//        String[] arr = new String[nums.length];
//        Arrays.sort(nums);
//        int count = 0;
//        for (int n: nums){
//            arr[count++] = String.valueOf(n);
//        }
//
//        String res = "";
//        for (String s: arr){
//            res += s;
//        }
//
//        return res;

        String arr[] = new String[nums.length];
        int i = 0;
        for(int val : nums){
            arr[i++] = String.valueOf(val);
        }

        Arrays.sort(arr,new Comparator<>(){
            public int compare(String x,String y){
                return (y+x).compareTo(x+y);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String val : arr) sb.append(val);

        String ans = sb.toString();
        return ans.charAt(0)=='0' ? "0" : ans;
    }
}
