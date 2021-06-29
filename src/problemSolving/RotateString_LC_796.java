package problemSolving;

public class RotateString_LC_796 {

    public boolean rotateString(String s, String goal) {

        if(s.equals(goal)){
            return true;
        }
        for(int i = 0; i < s.length(); i++){
            //s = s.substring(1) + s.substring(0,1);
            StringBuilder sb = new StringBuilder(s);
            char temp = s.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);
            s = sb.toString();
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
