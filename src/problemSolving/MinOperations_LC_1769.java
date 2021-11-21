package problemSolving;

public class MinOperations_LC_1769 {

    public static int[] minOperations(String boxes) {


        int [] res = new int[boxes.length()];
        int len = boxes.length();

        for (int i = 0; i < len; i++){
            int totalNumberOfMoves = 0;
            for (int j = 0; j < len; j++){
                char c = boxes.charAt(j);
                if (i == j) {}
                else {
                    if (c == '1') {
                        totalNumberOfMoves += Math.abs(j - i);
                    }
                }
            }
            res[i] = totalNumberOfMoves;
        }
        return res;
    }
}
