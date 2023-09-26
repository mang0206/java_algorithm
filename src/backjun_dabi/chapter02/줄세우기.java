package backjun_dabi.chapter02;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 줄세우기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] link = new int[n+1];
        List<List<Integer>> graph = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();

        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m;i++){
            int a = sc.nextInt(), b = sc.nextInt();
            graph.get(a).add(b);
            link[b]++;
        }
        sc.close();
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<=n;i++) {
            if(link[i]==0) {
                q.add(i);
                sb.append(i + " ");
            }
        }

        while(q.size() > 0){
            int node = q.peek();
            q.poll();

            for(int i=0; i<graph.get(node).size(); i++){
                int next_node = graph.get(node).get(i);
                link[next_node]--;
                if(link[next_node]== 0){
                    sb.append(next_node + " ");
                    q.add(next_node);
                }
            }
        }
        System.out.println(sb.toString());
    }
    
}
