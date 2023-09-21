package backjun_dabi.chapter02;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
public class 최소비용구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();;
        
        List<List<Integer[]>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt(), b= sc.nextInt(), c= sc.nextInt();
            graph.get(a).add(new Integer[] {b,c});
        }
        int start = sc.nextInt(), end = sc.nextInt();
        sc.close();
        int[] distance = new int[n+1];
        for(int i=1; i<=n; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;

        PriorityQueue<Integer[]> q = new PriorityQueue<>((o1, o2) -> o1[0]-o2[0]);
        q.add(new Integer[] {0, start});

        while(!q.isEmpty()){
            int dist = q.peek()[0], node = q.peek()[1];
            q.poll();
            if(distance[node] < dist)
                continue;
            
            for(int i=0; i<graph.get(node).size(); i++){
                int next_node = graph.get(node).get(i)[0], next_dist = graph.get(node).get(i)[1];
                int d = dist + next_dist;
                if(distance[next_node] > d){
                    distance[next_node] = d;
                    q.add(new Integer[] {d, next_node});
                }
            }
        }

        System.out.println(distance[end]);
    }
}
