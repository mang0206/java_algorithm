package backjun.O그래프;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;


public class dfs_bfs_r {
    static int[][] graph;
    static boolean[] visited;
    static int n;
    static StringBuilder sb;

    static void dfs(int v){
        sb.append(v + " ");
        visited[v] = true;

        for(int i=1; i<n+1;i++){
            if(graph[v][i] == 1 & !visited[i] ){
                dfs(i);
            }
        }

    }

    static void bfs(int v){
        Deque<Integer> q = new LinkedList<>();
        q.add(v);

        while(!q.isEmpty()){
            int node = q.removeFirst();
            sb.append(node + " ");
            visited[node] = true;

            for(int i=1; i<n+1;i++){
                if(graph[node][i]==1 & !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt(), v = sc.nextInt();
        graph = new int[n+1][n+1];
        
        for(int i=0; i<m;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        sc.close();

        visited = new boolean[n+1];
        sb = new StringBuilder();
        dfs(v);
        System.out.println(sb);

        visited = new boolean[n+1];
        sb = new StringBuilder();
        bfs(v);
        System.out.println(sb);
    }
    
}
