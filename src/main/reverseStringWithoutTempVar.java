package main;

import java.util.Scanner;

public class reverseStringWithoutTempVar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int start = 0;
        int end = str.length()-1;

        char arr[] = new char[];
//        str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        while (start < end)
        {
            // XOR for swapping the variable
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];

            ++start;
            --end;
        }
    }
}
