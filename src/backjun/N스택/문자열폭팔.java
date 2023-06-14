package backjun.N스택;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class 문자열폭팔 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        String[] s= sc.next().split("");
        String boom = sc.next();
        sc.close();
        int l =boom.length();
        for(String i:s){
            stack.push(i);
            boolean flag = false;
            
            if (stack.size() >= l){
                for(int j=0; j<l; j++){
                    if(!stack.get(stack.size()-l+j).equals(String.valueOf(boom.charAt(j)))){
                        flag = false;
                        break;
                    }
                    flag = true;
                }
            }
            if(flag) {
                for(int j=0; j<l; j++)
                    stack.pop();
            }
            
        }
        
        if(stack.size() == 0){
            System.out.println("FRULA");
        } else {
            // Arrays.stream(stack.toArray()).forEach(a-> {System.out.print(a);});
            for(int i=0; i<stack.size(); i++){
                System.out.print(stack.get(i));
            }
        }
    }
    
}
