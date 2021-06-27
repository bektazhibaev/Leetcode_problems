package problemSolving;

public class ShuffleString_LC_1528 {

    public String restoreString(String s, int[] indices) {

//        String str = "";
//
//        for (int i = 0; i < s.length(); i++){
//            for (int j = 0; j < indices.length; j++){
//
//                if(indices[j] == i){
//                    str += s.charAt(j);
//                }
//            }
//        }
//        return str;

        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++){

            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
