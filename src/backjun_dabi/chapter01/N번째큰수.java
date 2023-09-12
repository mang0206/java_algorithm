package backjun_dabi.chapter01;

import java.util.Scanner;
import java.util.PriorityQueue;

public class N번째큰수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // int[] arr= new int[10];
        PriorityQueue<Integer> pq;
        for(int t=0; t <T; t++){
            pq = new PriorityQueue<>();
            for(int i=0; i<10; i++)
                pq.add(-sc.nextInt());
            
            for(int i=0; i<2; i++)
                pq.poll();
            
            System.out.println(-pq.peek());
        }

        sc.close();
    }
    
}
