package backjun.J분할정복;

import java.util.Scanner;

public class 쿼드트리 {
    static int n;
    static int[][] arr;
    static StringBuilder bf;

    static void div_que(int x, int y, int n){
        int start = arr[x][y];
        if(n==1){
            if(start == 1) bf.append(1);
            else bf.append(0);
            return;
        }
        for(int i=x; i<x+n;i++){
            for(int j=y; j<y+n; j++){
                if(arr[i][j] != start){
                    int next_n = n/2;
                    bf.append("(");
                    div_que(x, y, next_n);
                    div_que(x, y+next_n, next_n);
                    div_que(x+next_n, y, next_n);
                    div_que(x+next_n, y+next_n, next_n);
                    bf.append(")");
                    return;
                }
            }
        }
        bf.append(start);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];
        for(int i=0; i<n; i++){
            String t = sc.next();
            for(int j=0; j<t.length();j++){
                arr[i][j] = t.charAt(j) - '0';
            }
        }
        sc.close();
        bf = new StringBuilder();
        div_que(0, 0, n);
        
        System.out.println(bf);
    }
    
}
