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

        SearchInsert_LC searchInsert_lc = new SearchInsert_LC();
        int[] arr = new int[]{1,2,3,5,6};

        System.out.println(searchInsert_lc.searchInsert(arr, 4));
    }
}
