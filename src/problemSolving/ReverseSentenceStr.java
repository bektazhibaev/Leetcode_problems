package problemSolving;

import main.theMain;

import java.util.Scanner;

public class ReverseSentenceStr extends theMain {

    /**
     * The purpose of this class is to take a space separated sentence string from the user
     * and return it reversed. It takes the string and splits it into space separated array of strings,
     * by using for loop it goes through each of the string elements of the array and takes the last element and
     * adds it into an empty string variable. Once the end of array is reached it 'reverSentence' methods returns
     * the reversed sentence.
     */

    public void inputScanner(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter space separated sentence: ");
        String userStr = scanner.nextLine();
        ReverseSentenceStr reverseSentenceStr = new ReverseSentenceStr();
        String resStr = reverseSentenceStr.reverseSentence(userStr);
        System.out.println(resStr);

    }

    //this method takes a string and returns a reversed version of it
    public String reverseSentence (String str){

        //splitting the sentence by spaces and storing it into a array of strings
        String[] strArr = str.split(" ");
        //declared an empty string variable to hold the reversed outcome of the given string
        String result = "";

        for (int i = 0; i < strArr.length; i++){
            //taking the last element of the array and adding it into an empty string variable
            result += strArr[strArr.length - i -1] + " ";
        }
        return result;
    }
}
