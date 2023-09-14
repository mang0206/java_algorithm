package backjun_dabi.chapter02;

import java.util.Scanner;
import java.util.Stack;

public class 괄호의값 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String galho = sc.nextLine();
        sc.close();
        int mul = 1;
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<galho.length(); i++){
            switch(galho.charAt(i)){
            case '(':
                mul *= 2;
                stack.push('(');
                break;
            case '[':
                mul *= 3;
                stack.push('[');
                break;
            case ')':
                if(stack.empty() || stack.peek() != '(') {
                    System.out.println(0);
                    return;
                }
                if(galho.charAt(i-1) == '(')
                    result += mul;
                mul /= 2;
                stack.pop();
                break;
            case ']':
                if(stack.empty() || stack.peek() != '[') {
                    System.out.println(0);
                    return;
                }
                if(galho.charAt(i-1) == '[')
                    result += mul;
                mul /= 3;
                stack.pop();
            }
        }
        if(stack.empty())
            System.out.println(result);
        else
            System.out.println(0);
    }
}
