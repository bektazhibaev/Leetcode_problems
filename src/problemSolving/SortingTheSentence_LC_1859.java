package problemSolving;

import java.util.Arrays;

public class SortingTheSentence_LC_1859 {

    public static void main(String[] args) {

        SortingTheSentence_LC_1859 obj = new SortingTheSentence_LC_1859();
        System.out.println(obj.sortSentence("is2 sentence4 This1 a3"));
    }

    public String sortSentence(String s) {

        String[] arr = s.split(" ");

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int num = Character.getNumericValue(arr[j].charAt(arr[j].length()-1));
                if (num == i + 1) {
                    result += arr[j].substring(0, arr[j].length()-1) + " ";
                }
            }
        }
        return result.trim();
    }
}
