package backjun.G백트래킹;

import java.util.Scanner;

public class 연산자끼워넣기 {
    static int[] arr;
    static int[] cal;
    static int max =-Integer.MAX_VALUE;
    static int min = Integer.MAX_VALUE;

    static int n;

    static void dfs(int pl, int mi, int mu, int di, int x, int idx){
        if(pl+mi+mu+di == 0){
            max = Math.max(max, x);
            min = Math.min(min, x);
            return;
        }

        if(pl > 0)  
            dfs(pl-1, mi, mu, di, x+arr[idx], idx+1);
        if(mi > 0)  
            dfs(pl, mi-1, mu, di, x-arr[idx], idx+1);
        if(mu > 0)  
            dfs(pl, mi, mu-1, di, x *arr[idx], idx+1);
        if(di > 0)  
            dfs(pl, mi, mu, di-1, (int)(x /arr[idx]), idx+1);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int[] cal = new int[4];

        for(int i=0; i<4; i++)
            cal[i] = sc.nextInt();
        sc.close();

        dfs(cal[0], cal[1], cal[2], cal[3], arr[0], 1);

        System.out.println(max);
        System.out.println(min);
    }
}
