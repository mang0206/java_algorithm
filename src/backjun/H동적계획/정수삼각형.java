package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;

public class 정수삼각형 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] arr = new int[n][];
        for(int i=0; i<n;i++){
            arr[i] = new int[i+1];
            for(int j=0; j<i+1; j++)
                arr[i][j] = sc.nextInt();
        }
        sc.close();
        for(int i=1;i<n;i++){
            for(int j=0; j<=i; j++){
                if(j==0)
                    arr[i][j] += arr[i-1][j];
                else if(i==j)
                    arr[i][j] += arr[i-1][j-1];
                else
                    arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
            }   
        }

        System.out.println(Arrays.stream(arr[n-1]).max().getAsInt());
    }
    
}
