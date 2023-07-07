package backjun.O그래프;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class 유기농배추 {
    static int[] dx = { 1, 0, -1, 0};
    static int[] dy = { 0, 1, 0, -1};
    static int n;
    static int m;
    static byte[][] board;
    static boolean[][] visited;

    static void bfs(int w, int e){
        Queue<Integer[]> q = new LinkedList<Integer[]>();
        q.add(new Integer[] {w,e}); 

        while(!q.isEmpty()){
            int x = q.peek()[0];
            int y = q.peek()[1];
            q.poll();
            visited[x][y] = true;
            for(int o=0; o<4; o++){
                int n_x = x+dx[o], n_y = y+dy[o];
                if(n_x >= 0 & n_x < n & 0<=n_y & n_y < m){
                    if(visited[n_x][n_y] == false & board[n_x][n_y] == 1){
                        visited[n_x][n_y] = true;
                        q.add(new Integer[] {n_x, n_y});
                    }
                }
            }
        }
    }

    static int maps(Scanner sc){
        n = sc.nextInt(); m = sc.nextInt(); int k = sc.nextInt();
        board = new byte[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<k;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            board[a][b] = 1;
        }

        int cnt = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m;j++){
                
                if(board[i][j] == 1 & !visited[i][j]){
                    cnt++;
                    bfs(i,j);
                }
            }
        }
        
        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            System.out.println(maps(sc));
        }
        sc.close();
    }
    
}
