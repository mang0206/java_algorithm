package backjun.H동적계획;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class 숫자1로만들기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        boolean[] visited = new boolean[n+1];
        Deque<Integer[]> q = new LinkedList<>();
        Integer[] a = {n, 0};
        q.add(a);

        while(q.size() > 0){
            Integer[] t = q.removeFirst();
            int x = t[0], deph = t[1];

            if (x == 1){
                System.out.println(deph);
                return;
            }

            if(x % 3 == 0){
                int x3 = x / 3;
                if(x3 > 0 & visited[x3] == false){
                    visited[x3] = true;
                    Integer[] x33 = {x3, deph+1};
                    q.addLast(x33);
                }
            }
            if(x % 2 == 0){
                int x2 = x / 2;
                if(x2 > 0 & visited[x2] == false){
                    visited[x2] = true;
                    Integer[] x22 = {x2, deph+1};
                    q.addLast(x22);
                }
            }
            --x;
            if(visited[x] == false){
                visited[x] = true;
                Integer[] xm = {x, deph+1};
                q.addLast(xm);
            }

        }

    }
}
