package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;

public class 증가하는부분수열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }
        sc.close();

        for(int i=0; i<n;i++){
            for(int j=i; j<n; j++){
                if(arr[j] > arr[i]){
                    dp[j] = Math.max(dp[j], dp[i]+1);
                }
            }
        }

        // Arrays.stream(dp).forEach(a -> {System.out.print(a+" ");});
        // System.out.println();
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
    
}
