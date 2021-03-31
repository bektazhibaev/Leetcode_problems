package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The purpose of this class is to have a method that will identify the letters vs. digits and
 * return the digits as integers an in array.
 */

public class LettersAndDigits {

    Scanner scanner = new Scanner(System.in);
    public void digitsList(){

        System.out.println("Please enter a string containing letters and digits: ");
        String s = scanner.next();
        System.out.println(findDigits(s));

    }

    public List<Integer> findDigits(String str){
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++){

            if(Character.isDigit(str.charAt(i)))
                arrList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        return arrList;
    }
}
