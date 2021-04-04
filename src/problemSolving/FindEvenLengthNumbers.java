package problemSolving;

import java.util.Scanner;

/**
 * This class has 2 methods: findEvenLengthDigitNumbers() - Takes an input from the user;
 * returnNumber(int[] array) - takes one element at a time and divides it by 10 until it becomes 0
 * and then returns the count if the length of that element's digits is even number;
 */

public class FindEvenLengthNumbers {

    public void findEvenLengthDigitNumbers(){

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Please enter a number for each request: ");
            arr[i] = scanner.nextInt();
        }
        FindEvenLengthNumbers f = new FindEvenLengthNumbers();
        System.out.println(f.returnNumber(arr));
    }

    public int returnNumber(int[] ar){
        int n = 0;
        int count = 0;
        int cur;
        for(int i = 0; i < ar.length; i++){
            cur = ar[i];
            while (cur != 0){
                cur = cur/10;
                count++;
            }
            if(count % 2 == 0){
                n++;
            }
            count = 0;

        }
        return n;
    }
}
