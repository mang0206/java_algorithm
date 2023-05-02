package backjun.Carray2;

import java.util.Scanner;

public class 색종이 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];

        int w = sc.nextInt();
        for(int i=0;i<w;i++){
            int y= sc.nextInt(), x= sc.nextInt();

            for(int n=x; n<x+10; n++){
                for(int m=y; m<y+10; m++)
                    arr[n][m] = 1;
            }
        }

        sc.close();

        int cnt = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j] == 1){
                    cnt += 1;
                }
            }
        }

        System.out.println(cnt);
    }
    
}
