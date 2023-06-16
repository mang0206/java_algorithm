package backjun.N스택;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class 히스토그램 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0; i<n;i++){
            arr[i] =  sc.nextLong();
        }
        sc.close();

        long result = Arrays.stream(arr).min().getAsLong() * n;
        for(int i=0; i<n;i++){
            while(stack.size() > 0 && arr[stack.peek()] > arr[i]){
                long height = arr[stack.pop()];
                long width = stack.isEmpty() ? i : i - stack.peek()-1;
                result = Math.max(width*height, result);
            }
            stack.push(i);
        }

        if(stack.size()>0){
            while(stack.size() > 0){
                long height = arr[stack.pop()];
                long width = stack.isEmpty() ? n : n - stack.peek()-1;
                result = Math.max(width*height, result);
            }
        }
        System.out.println(result);
    }
    
}
