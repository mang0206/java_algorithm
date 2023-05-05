package backjun.Esorting;

import java.util.Scanner;
import java.util.PriorityQueue;
public class 수정렬하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> h = new PriorityQueue<>();

        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            int t = sc.nextInt();
            h.add(t);
        }
        sc.close();

        for(int i=0; i<n;i++){
            System.out.println(h.poll());
        }
    }
    
}
