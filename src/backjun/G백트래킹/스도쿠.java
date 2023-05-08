package backjun.G백트래킹;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class 스도쿠 {
    static int[][] arr;
    static boolean[] visited;
    static List<Integer[]> zero;
    static boolean flag;

    static boolean check(int x, int y, int num) {
        for(int i=0; i<9; i++){
            if(arr[i][y] == num) return false;
            if(arr[x][i] == num) return false;

            int n = (x/3) * 3, m = (y/3) * 3;

            for(int k=n; k<n+3; k++){
                for(int t=m; t<m+3; t++){
                    if(arr[k][t] == num) return false;
                }
            }
        }

        return true;
    }
    static void dfs(int idx){
        if(flag){
            return;
        }
        if(idx == zero.size()){
            for(int i=0; i<9; i++){
                for(int j:arr[i]){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            flag = true;
            return;
        }

        for(int i=0; i<zero.size(); i++){
            int x = zero.get(i)[0], y= zero.get(i)[1];
            for(int t=1; t<10; t++) {
                if(!visited[i] & check(x,y,t)){
                    visited[i] = true;
                    arr[x][y] = t;
                    dfs(idx+1);
                    visited[i] = false;
                    arr[x][y] = 0;
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        arr = new int[9][9];
        zero = new ArrayList<Integer[]>();

        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();

                if(arr[i][j] == 0){
                    Integer[] z = {i,j};
                    zero.add(z);
                }
            }
        }
        sc.close();
        visited = new boolean[zero.size()];

        dfs(0);
    }
}