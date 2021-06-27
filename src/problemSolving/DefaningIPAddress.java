package problemSolving;

public class DefaningIPAddress {

    public String defangIPaddr(String address) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char c: address.toCharArray()){
            if(Character.isDigit(c)){
                stringBuilder.append(c);
            }else {
                stringBuilder.append("[.]");
            }
        }

        return new String(stringBuilder);
    }
}
