package backjun.O그래프;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class 숨바꼭질 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt(), end = sc.nextInt();
        sc.close();

        boolean[] visited = new boolean[100001];
        Deque<Integer[]> q = new LinkedList<>();

        q.add(new Integer[] {start, 0});

        while(!q.isEmpty()){
            int x = q.peek()[0];
            int deph = q.peek()[1];
            q.poll();

            if(x==end){
                System.out.println(deph);
                break;
            }

            if(x+1 < end+2 && !visited[x+1]){
                visited[x+1] = true;
                q.add(new Integer[] {x+1, deph+1});
            }
            if(x-1 >= 0 && !visited[x-1]){
                visited[x-1] = true;
                q.add(new Integer[] {x-1, deph+1});
            }
            if(x*2 < end+2 && !visited[x*2]){
                visited[x*2] = true;
                q.add(new Integer[] {x*2, deph+1});
            }
        }
    }
    
}
