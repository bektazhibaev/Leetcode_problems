package problemSolving;

import java.util.Scanner;

/**
 * This class has 2 methods and one takes an input and passes it as an argument to second one and
 *  the second one takes that input and reverses and returns it back to first method.
 */

public class ReverseString {

    public void getInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word to be reversed: ");
        String word = scanner.next();
        System.out.println(ReverseString.reversedString(word));
    }

    public static String reversedString(String input){

        String res = "";
        for (int i = input.length()-1; i >=0; i--){
            res += String.valueOf(input.charAt(i));
        }
        return res;
    }
}
