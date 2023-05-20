package backjun.J분할정복;

import java.util.Scanner;

public class 색종이만들기 {
    static int result;
    static int n;
    static int[][] arr;
    static int b; static int w;
    
    static void div_que(int x, int y, int n){
        int start = arr[x][y];
        if(n==1){
            if (start == 1) b++;
            else w++;
            return;
        }

        for(int i=x;i<n+x;i++){
            for(int j=y;j<n+y;j++){
                if(arr[i][j] != start){
                    div_que(x, y, n/2);
                    div_que(x, y+ n/2, n/2);
                    div_que(x+ n/2, y, n/2);
                    div_que(x+n/2, y+n/2, n/2);
                    return;
                }
            }
        }

        if (start == 1) b += 1;
        else w += 1;

    }
    public static void main(String[] args){
        result = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        sc.close();
        
        div_que(0,0,n);

        System.out.println(w);
        System.out.println(b);
    }
    
}
