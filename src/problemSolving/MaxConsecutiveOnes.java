package problemSolving;

import java.util.Scanner;

/**
 * The purpose if this class is to take a string from the user, and print out the max number of consecutive 1's in it.
 */

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;
    }

    public void getInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers containing 1's and have some of them consecutive: ");
        //User input is a string
        String str = scanner.next();
        int[] arr = new int[str.length()];
        // Storing each character of the input string into an array
        for (int i = 0; i < str.length(); i++){
            // Converting each of the characters of a string into an integer and storing an element at a time into the array
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(arr));
    }
}
