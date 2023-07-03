package backjun.O그래프;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class dfs_bfs {
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb;
    // static int idx;
    static void dfs(int N, int node){
        sb.append(node+1 + " ");
        visited[node] = true;
        for(int i=0; i<N; i++){
            if(!visited[i] & graph[node][i]==1){
                visited[i] = true;
                dfs(N, i);
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), v = sc.nextInt();
        sb = new StringBuilder();
        graph = new int[n][n];

        for(int i=0; i<m; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a-1][b-1] = 1;
            graph[b-1][a-1] = 1;
        }
        sc.close();

        visited = new boolean[n];
        dfs(n, v-1);

        System.out.println(sb);

        visited = new boolean[n];
        sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        q.add(v-1);
        while(!q.isEmpty()){
            int node = q.poll();
            sb.append(node+1+ " ");

            visited[node] = true;
            for(int i=0; i<n;i++){
                if(graph[node][i] == 1 & visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println(sb);

    }
    
}
