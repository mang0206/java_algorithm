package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;

public class 전깃줄 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int[] dp = new int[n];

        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            dp[i]= 1;
        }
        sc.close();

        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j][1] > arr[i][1]){
                    dp[j] = Math.max(dp[j], dp[i] + 1);
                }
            }
        }

        // Arrays.stream(dp).forEach(a -> System.out.print(a + " ")); System.out.println();
        System.out.println(n - Arrays.stream(dp).max().getAsInt());
    }
    
}
