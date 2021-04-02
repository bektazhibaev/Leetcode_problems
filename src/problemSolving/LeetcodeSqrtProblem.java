package problemSolving;

public class LeetcodeSqrtProblem {

    public int returnSqrt (int x){

        int left = 1;
        int right = x;
        int mid = 0;

        if(x < 2){
            return x;
        }

        while (left < right){

            mid = left + (int) Math.floor((right-left)/2);

            if(mid * mid == x){
                return mid;
            }else if(mid * mid > x){
                right = mid;
            }else if(mid * mid < x){
                left = mid + 1;
            }
        }

        return left - 1;

    }

}
