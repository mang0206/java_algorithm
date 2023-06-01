package backjun.M동적계획2;

import java.util.Scanner;
import java.util.PriorityQueue;

public class 파일합치기 {
    static void solution(Scanner sc){
        int n = sc.nextInt();

        int[] arr = new int[n];
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0; i<n;i++){
            int t = sc.nextInt();
            arr[i] = t;
            q.add(t);
        }
        int result = 0;
        while(q.size() >= 2){
            int t = q.poll();
            int append = t + q.poll();
            result += append;
            q.add(append);
        }

        System.out.println(result);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            solution(sc);
        }
        sc.close();
    }
    
}
