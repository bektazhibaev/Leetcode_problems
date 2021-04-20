package main;

import java.util.Arrays;

public class arrayRotation {

    public static void main(String[] args) {


        int arr[] = {6,4,3,1,10,8,9};
        int expectedArr[] = new int[arr.length];
        int k = 4;
        int[] initFillUp = new int[k];
         for(int i = 0, j = k; i < k; i++){
             expectedArr[i] = arr[arr.length-j];
             j--;
         }

//        expectedArr[0] = arr[arr.length-2];
//        expectedArr[1] = arr[arr.length-1];

        for (int i = k; i <expectedArr.length; i++){
            expectedArr[i] = arr[i-k];
        }

        System.out.println(Arrays.toString(expectedArr));

    }
}
