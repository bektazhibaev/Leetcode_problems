package problemSolving;

import java.util.*;

public class GreatestNumberOfCandies_LC_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> list = new ArrayList<>();

//        Integer[] arr = new Integer[candies.length];
//        for (int i = 0; i < candies.length; i++){
//            arr[i] = Integer.valueOf(candies[i]);
//        }
//
//        int max = Collections.max(Arrays.asList(arr));
        int max = 0;
        for (int i = 0; i < candies.length; i++){
            if(candies[i] >= max){
                max = candies[i];
            }
        }

        for (int j = 0; j < candies.length; j++){
            if(candies[j]+extraCandies >= max){
                list.add(true);
            }
            else list.add(false);
        }
        return list;
    }
}
