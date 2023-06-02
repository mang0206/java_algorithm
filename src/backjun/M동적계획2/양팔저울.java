package backjun.M동적계획2;

import java.util.Scanner;
import java.util.HashSet;

public class 양팔저울 {
    static HashSet<Integer> set;
    static int[] bead;
    static int n;
    static int[][] dp;

    static void dfs(int left, int right, int x){
        int tmp = Math.abs(right - left);
        set.add(tmp);

        if(x==n){
            return;
        }

        if(dp[x][tmp] == 0) {
            dfs(left+bead[x], right, x+1);
            dfs(left, right+bead[x], x+1);
            dfs(left, right, x+1);
            dp[x][tmp] = 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        bead = new int[n];

        for(int i=0; i<n;i++){
            bead[i] = sc.nextInt();
        }

        set = new HashSet<>();
        dp = new int[n][30*500+1];

        dfs(0, 0, 0);
        
        n = sc.nextInt();
        for(int i=0; i<n;i++){
            int t = sc.nextInt();
            if(set.contains(t))
                System.out.print("Y ");
            else
                System.out.print("N ");
        }
        sc.close();
    }
}
