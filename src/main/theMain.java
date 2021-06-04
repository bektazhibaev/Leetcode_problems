package main;

import problemSolving.*;

import java.util.Arrays;

public class theMain {

    public static void main(String[] args) {
        //Creating an instance of reverseSentenceStr class
        // to call it's methods for reverse a sentence
//        ReverseSentenceStr reverseSentenceStr = new ReverseSentenceStr();
//        reverseSentenceStr.inputScanner();
//
//        //Creating an instance of reverseString class
//        // to call it's methods to reverse a word
//        ReverseString reverseString = new ReverseString();
//        reverseString.getInput();
//
//        LettersAndDigits lettersAndDigits = new LettersAndDigits();
//        lettersAndDigits.digitsList();
//
//        LeetcodeSqrtProblem leetcodeSqrtProblem = new LeetcodeSqrtProblem();
//        System.out.println("Square root is: "+leetcodeSqrtProblem.returnSqrt(10000));

//        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
//        mco.getInput();

//        FindEvenLengthNumbers feln = new FindEvenLengthNumbers();
//        feln.findEvenLengthDigitNumbers();

//        RemoveElement_LC removeElement_lc = new RemoveElement_LC();
//        removeElement_lc.getArrayAndValue();

//        SearchInsert_LC searchInsert_lc = new SearchInsert_LC();
//        int[] arr = new int[]{1,2,3,5,6};
//
//        System.out.println(searchInsert_lc.searchInsert(arr, 4));

//        RemoveDuplicatesFromSortedArray_LC_26 removeDuplicatesFromSortedArray_lc_26 = new RemoveDuplicatesFromSortedArray_LC_26();
//        int[] arr= new int[]{1,1,3,1,4};
//        removeDuplicatesFromSortedArray_lc_26.removeDuplicates(arr);

//        MaximumSubarray_LC_53 maximumSubarray_lc_53 = new MaximumSubarray_LC_53();
//        int[] ar = new int[]{-1, -2, -8, 7, 6};
//        System.out.println(maximumSubarray_lc_53.maxSubArray(ar));

//        ClimbingStairs_LC_70 climbingStairs_lc_70 = new ClimbingStairs_LC_70();
//        System.out.println(climbingStairs_lc_70.climbStairs(3));

//        MajorityElement_LC_169 majorityElement_lc_169 = new MajorityElement_LC_169();
//        int[] nums = new int[]{3,2,3};
//        System.out.println(majorityElement_lc_169.majorityElement(nums));
//
//        CountPrimes_LC_204 countPrimes_lc_204 = new CountPrimes_LC_204();
//        System.out.println(countPrimes_lc_204.countPrimes(499979));

        CanPlaceFlowers_LC_605 canPlaceFlowers_lc_605 = new CanPlaceFlowers_LC_605();
        int[] arr = new int[]{0};
        System.out.println(canPlaceFlowers_lc_605.canPlaceFlowers(arr, 2));

    }
}
