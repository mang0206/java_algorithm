package backjun.Dbruteforce;

import java.util.Scanner;
public class 블랙잭 {
    static int result;
    static boolean[] visited;
    static int[] card_arr;

    static void bt(int m, int s, int deph){
        if (deph == 3){
            if(s<= m)
                result = Math.max(result, s);
            return;
        }
        
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                visited[i] = true;
                bt(m, s+card_arr[i], deph+1);
                visited[i] = false;
            }
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt(), m= sc.nextInt();
        card_arr = new int[n];
        visited = new boolean[n];

        for(int i=0; i<n; i++)
            card_arr[i] = sc.nextInt();

        sc.close();
        bt(m, 0, 0);

        System.out.println(result);
    }
    
}
