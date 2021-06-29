package problemSolving;

public class GoalParserInterpret_LC_1678 {

    public String interpret(String command) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                sb.append("o");
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a'){
                sb.append("al");
                i=i+3;
            }
            else sb.append("G");
        }
        return sb.toString();
    }
}
