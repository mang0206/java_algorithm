package backjun.L우선순위큐;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;

public class 최대힙 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();

            if(t==0){
                if(q.size() == 0)
                    sb.append(0 + " ");
                else
                    sb.append(q.poll() + " ");
            }
            else
                q.add(t);
        }
        sc.close();
        // System.out.println("----");
        StringTokenizer st = new StringTokenizer(sb.toString(), " ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
