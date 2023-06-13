package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;
public class 평범한배낭 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[][] dp = new int[n+1][k+1];

        int[][] juwel = new int[n][2];
        for(int i =0; i<n;i++){
            int w = sc.nextInt(), v = sc.nextInt();
            juwel[i][0] = w; juwel[i][1] = v;
        }
        sc.close();

        for(int i=1; i<n+1;i++){
            for(int j=1;j<k+1;j++){
                int w = juwel[i-1][0], v = juwel[i-1][1];
                if (j < w){
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w] + v);
                }
            }
        }

        for(int i=0; i<n+1; i++){
            Arrays.stream(dp[i]).forEach(a->System.out.print(a + " "));
            System.out.println();
        }
        System.out.println(dp[n][k]);
    }
    
}
