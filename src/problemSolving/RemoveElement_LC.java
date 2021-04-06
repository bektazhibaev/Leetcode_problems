package problemSolving;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leetcode Remove Element task.
 * Link: https://leetcode.com/problems/remove-element/
 */

public class RemoveElement_LC {

    public void getArrayAndValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length for the array: ");
        int lengthArr = scanner.nextInt();
        int[] nums = new int[lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("Please enter an integer for: " + i + "'th element");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Please enter the element to be removed: ");
        int el = scanner.nextInt();
        RemoveElement_LC removeElement_lc = new RemoveElement_LC();
        System.out.println(Arrays.toString(removeElement_lc.removeElement(nums, el)));

    }

    public int[] removeElement(int[] nums, int target){
        int count = 0;
        int temp;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != target){
                count++;
            }
            else {
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j] != target){
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
