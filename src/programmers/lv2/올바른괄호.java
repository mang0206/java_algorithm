package programmers.lv2;
import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(stack.empty()){
                if(s.charAt(i) == ')' ) return false;
                else stack.push("(");
            } else {
                if(s.charAt(i) == ')') stack.pop();
                else stack.push("(");
            }
        }
        if(stack.size() > 0) return false;

        return true;
    }
}
