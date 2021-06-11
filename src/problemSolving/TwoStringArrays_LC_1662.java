package problemSolving;

public class TwoStringArrays_LC_1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

//        String a = "";
//        String b = "";
//
//        for (int i = 0; i < word1.length;i++){
//            a += word1[i];
//        }
//
//        for (int j = 0; j < word2.length;j++){
//            b += word2[j];
//        }
//
//        if(a.equals(b)){
//            return true;
//        }
//        return false;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String a: word1){
            sb1.append(a);
        }

        for(String b: word2){
            sb2.append(b);
        }

        if(sb1.toString().equals(sb2.toString())) return true;
        return false;
    }
}
