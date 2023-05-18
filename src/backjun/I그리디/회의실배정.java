package backjun.I그리디;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class 회의실배정 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        Deque<Integer> q = new LinkedList<>();
        
        for(int i=0;i<n ; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr, (o1, o2) -> { return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];});
        q.add(arr[0][1]);

        for(int i = 1; i<n; i++){
            if (arr[i][0] >= q.peekLast()) 
                q.addLast(arr[i][1]);
        }

        System.out.println(q.size());

    }
}
