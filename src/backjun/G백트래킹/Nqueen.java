package backjun.G백트래킹;

import java.util.Scanner;

public class Nqueen {
    static int[] chess;
    static boolean[] visited;
    static int result;
    static int n;

    static boolean check(int num, int i){
        for(int k=0; k<i; k++){
            if(chess[k] == num)
                return false;
        }
        for(int k=0; k<i; k++){
            if(Math.abs(num - chess[k]) == i-k)
                return false;
        }

        return true;
    }

    static void dfs(int idx){
        if(idx == n) {
            // for(int i=0; i<n;i++)
            //     System.out.print(chess[i]+" ");
            // System.out.println();
            result++;
            return;
        }

        for(int i=0; i<n; i++){
            if(check(i,idx)) {
                chess[idx] = i;
                dfs(idx+1);
                chess[idx] = 0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.close();

        chess = new int[n];
        visited = new boolean[n];
        result = 0;

        dfs(0);

        System.out.println(result);
    }
}
