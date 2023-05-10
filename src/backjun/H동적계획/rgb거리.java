package backjun.H동적계획;

import java.util.Scanner;
import java.util.Arrays;

public class rgb거리 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr =new int[n][3];
        
        for(int i=0; i<n;i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int i=1;i<n;i++){
            arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
            arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
            arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
        }

        int min = Arrays.stream(arr[n-1]).min().getAsInt();
        System.out.println(min);

    }
}
