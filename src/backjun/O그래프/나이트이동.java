package backjun.O그래프;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class 나이트이동 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] direction = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
        for(int z=0; z<T;z++){
            int l = sc.nextInt();
            int s_x = sc.nextInt(), s_y = sc.nextInt();
            int e_x = sc.nextInt(), e_y = sc.nextInt();

            boolean[][] visited = new boolean[l][l];
            Deque<Integer[]> q = new LinkedList<>();
            q.add(new Integer[] {s_x, s_y, 0});

            while(!q.isEmpty()){
                int x = q.peek()[0], y = q.peek()[1], deph = q.peek()[2];
                q.poll();

                if(x==e_x & y == e_y){
                    System.out.println(deph);
                    break;
                }

                visited[x][y] = true;

                for(int i=0; i<8; i++){
                    int nx = x+ direction[i][0], ny = y+direction[i][1];
                    if(nx >= 0 && nx < l && ny >= 0 && ny < l && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.add(new Integer[] {nx, ny, deph+1});
                    }
                }
            }
        }
        sc.close();
    }
}
