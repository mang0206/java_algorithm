package backjun.O그래프;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.util.Deque;
import java.util.LinkedList;

public class 바이러스 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int com = sc.nextInt();
        int n = sc.nextInt();
        List<Integer>[] graph = new ArrayList[com+1];
        for(int i=1; i<com+1; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<n;i++){
            int s = sc.nextInt(), e= sc.nextInt();
            graph[s].add(e);
            graph[e].add(s);
        }
        sc.close();
        
        boolean[] visited = new boolean[com+1];
        Deque<Integer> q = new LinkedList<>();

        int result = 0;
        q.add(1);
        while(!q.isEmpty()){
            int node = q.removeFirst();

            visited[node] = true;

            for(int g:graph[node]){
                if(visited[g]==false){
                    visited[g] = true;
                    result += 1;
                    q.add(g);
                }
            }
        }
        System.out.println(result);
    }
    
}
