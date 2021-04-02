package main;

import problemSolving.LeetcodeSqrtProblem;
import problemSolving.LettersAndDigits;
import problemSolving.ReverseSentenceStr;
import problemSolving.ReverseString;

import java.util.Arrays;

public class theMain {

    public static void main(String[] args) {
        //Creating an instance of reverseSentenceStr class
        // to call it's methods for reverse a sentence
        ReverseSentenceStr reverseSentenceStr = new ReverseSentenceStr();
        reverseSentenceStr.inputScanner();

        //Creating an instance of reverseString class
        // to call it's methods to reverse a word
        ReverseString reverseString = new ReverseString();
        reverseString.getInput();

        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.digitsList();

        LeetcodeSqrtProblem leetcodeSqrtProblem = new LeetcodeSqrtProblem();
        System.out.println("Square root is: "+leetcodeSqrtProblem.returnSqrt(10000));
    }
}
