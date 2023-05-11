package backjun.H동적계획;

import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] stair = new int[n];
        int[] dp = new int[n];
        
        for(int i=0; i<n; i++){
            stair[i] = sc.nextInt();
        }
        sc.close();

        dp[0] = stair[0];
        if(n == 1) { System.out.println(dp[0]); return; }
        dp[1] = stair[1] + stair[0];
        if(n == 2) { System.out.println(dp[1]); return; }
        dp[2] = Math.max(stair[1], stair[0]) + stair[2];
        for(int i=3; i<n; i++){
            dp[i] = stair[i] + Math.max(dp[i-3] + stair[i-1], dp[i-2]);
        }
        System.out.println(dp[n-1]);

    }
    
}
