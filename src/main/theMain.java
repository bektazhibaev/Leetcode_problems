package main;

import problemSolving.ReverseSentenceStr;
import problemSolving.ReverseString;

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

    }
}
