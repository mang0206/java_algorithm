package backjun.I그리디;

import java.util.Scanner;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        for(int i=1; i<n;i++){
            arr[i] += arr[i-1];
        }
        System.out.println(Arrays.stream(arr).sum());

    }
    
}
