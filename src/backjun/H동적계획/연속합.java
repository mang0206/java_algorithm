package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;
public class 연속합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++)
            arr[i] = sc.nextInt();
        sc.close();
        
        int[] dp = new int[n];
        dp[0] = arr[0];

        for(int i=1; i<n;i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
        }
        

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
    
}
