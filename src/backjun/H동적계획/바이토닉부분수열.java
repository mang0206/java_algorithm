package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;

public class 바이토닉부분수열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            dp1[i] = 1;
            dp2[i] = 1;
        }
        sc.close();
        
        for(int i=0; i<n;i++){
            for(int j=i; j<n; j++){
                if(arr[j] > arr[i]){
                    dp1[j] = Math.max(dp1[j], dp1[i] + 1);
                }

                if(arr[n-j-1] > arr[n-i-1]){
                    dp2[n-j-1] = Math.max(dp2[n-j-1], dp2[n-i-1] + 1);
                }
            }
        }

        // Arrays.stream(dp1).forEach(a -> System.out.print(a + " "));
        // System.out.println();
        // Arrays.stream(dp2).forEach(a -> System.out.print(a + " "));
        // System.out.println();

        for(int i=0; i<n; i++)
            dp2[i] += dp1[i];
        
        System.out.println(Arrays.stream(dp2).max().getAsInt() - 1);
    }
    
}
