package backjun.O그래프;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class 미로탐색 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] board = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n;i++){
            String s = sc.next();
            for(int j=0; j<s.length(); j++){
                board[i][j] = s.charAt(j) - '0';
            }
        }
        sc.close();

        Queue<Integer[]> q = new LinkedList<Integer[]>();
        q.add(new Integer[] {0,0,0});
        
        while(!q.isEmpty()){
            int x = q.peek()[0], y = q.peek()[1], deph = q.peek()[2];
            q.poll();
            if(x == n-1 & y == m-1){
                System.out.println(deph+1);
                break;
            }
            visited[x][y] = true;

            for(int i=0; i<4;i++){
                int nx = x+dx[i], ny = y+dy[i];

                if(nx>= 0 & nx<n & ny >=0 & ny <m){
                    if(!visited[nx][ny] & board[nx][ny] == 1){
                        visited[nx][ny] = true;
                        q.add(new Integer[] {nx, ny, deph+1});
                    }
                }
            }

        }

    }
    
}
