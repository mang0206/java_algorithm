package backjun.O그래프;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {
    static int n;
    static int cnt;
    static int[][] board;
    static boolean[][] visited;
    static int[][] direction = {{1, 0},{-1, 0}, {0, 1}, {0, -1}};

    static void dfs(int x, int y){
        cnt++;
        visited[x][y] = true;
        for(int i=0;i<4;i++){
            int next_x = x+direction[i][0], next_y = y+direction[i][1];
            if(next_x >=0 & next_x < n & next_y >= 0 & next_y < n){
                if(board[next_x][next_y] == 1 & !visited[next_x][next_y]){
                    // visited[next_x][next_y] = true;
                    dfs(next_x, next_y);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        board = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n;i++){
            String tmp = sc.next();
            for(int j=0; j<n; j++){
                board[i][j] = tmp.charAt(j) - '0';
            }
        }
        sc.close();

        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                cnt = 0;
                if(board[i][j] == 1 & !visited[i][j]){
                    dfs(i,j);
                    result.add(cnt);
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());

        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
