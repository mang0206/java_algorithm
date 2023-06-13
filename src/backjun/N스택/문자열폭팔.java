package backjun.N스택;
import java.util.Scanner;
import java.util.Stack;

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
                System.out.println(stack);
                for(int j=0; j<l; j++){
                    System.out.println(stack.get(stack.size()- l + j) + " | " + String.valueOf(boom.charAt(j)));
                    if(stack.get(stack.size()- l + j) != String.valueOf(boom.charAt(j))){
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
            System.out.println(stack);
        }
    }
    
}
