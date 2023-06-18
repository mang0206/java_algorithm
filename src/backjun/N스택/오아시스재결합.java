package backjun.N스택;

import java.util.Scanner;
import java.util.Stack;

public class 오아시스재결합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Long> stack = new Stack<>();

        Long[] arr = new Long[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextLong();
        }
        sc.close();

        int result = n-1;
        for(int i=0;i<n-2;i++){
            stack.push(arr[i]);
            stack.push(arr[i+1]);
            int idx = i+2;
            while(idx < n){
                if(stack.get(0) < stack.peek()){
                    break;
                }
                if(arr[idx] >= stack.peek()){
                    result += 1;
                }
                stack.push(arr[idx]);
                
                // System.out.println(stack);
                idx += 1;
            }
            stack.clear();
        }
        System.out.println(result);
    }
    
}
