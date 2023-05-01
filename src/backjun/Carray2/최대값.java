package backjun.Carray2;

import java.util.Scanner;
public class 최대값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int m = 0;
        int a = 0, b=0;
        for(int i=0; i<9;i++){
            for(int j=0; j<9;j++){
                arr[i][j] = sc.nextInt();

                if (m < arr[i][j]){
                    m = arr[i][j];
                    a = i;
                    b=j;
                }
            }
        }
        sc.close();

        System.out.println(m);
        System.out.println((a+1) +" "+ (b+1));        
    }
}
