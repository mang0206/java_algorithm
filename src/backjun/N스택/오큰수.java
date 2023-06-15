package backjun.N스택;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class 오큰수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            result[i] = -1;
        }
        sc.close();

        for(int i=0; i<n; i++){
            while(stack.size() > 0 && arr[stack.peek()] < arr[i]){
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        Arrays.stream(result).forEach(a -> {System.out.print(a + " ");});
    }
    
}
