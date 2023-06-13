package backjun.M동적계획2;

import java.util.Scanner;

public class 동전 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] coin = new int[n];
        int[] dp = new int[k+1];

        for(int i=0; i<n;i++){
            coin[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=1; j<=k; j++){
                if(j == coin[i])
                    dp[j] += 1;
                else if(j > coin[i])
                    dp[j] = dp[j-coin[i]] + dp[j]; 
                
            }
        }
        
        System.out.println(dp[k]);
    }
    
}
