package problemSolving;

public class CheckNumbersAscendingInSentence_LC_2042 {

    public static void main(String[] args) {
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));

    }

    public static boolean areNumbersAscending(String s) {

        String[] arr = s.split(" ");
        int current = -1;
        int previous = -1;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            boolean isNum = false;
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                char c = arr[i].charAt(j);
                if (Character.isDigit(c)) {
                    count++;
                    isNum = true;
                }
                else {
                    isNum = false;
                    break;
                }
                if (count == arr[i].length()) current = Integer.parseInt(arr[i]);
            }

            if (isNum) {
                if (current > previous) {
                    previous = current;
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}
