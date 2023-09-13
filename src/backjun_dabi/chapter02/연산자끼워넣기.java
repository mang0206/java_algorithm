package backjun_dabi.chapter02;
import java.util.Scanner;

public class 연산자끼워넣기 {
    static boolean[] visited;
    static int n;
    static int max;
    static int min;
    static int[] arr;

    static void dfs(int pl, int mi, int mu, int di, int deph, int cnt){
        if (deph==n) {
            max = Math.max(max, cnt);
            min = Math.min(min, cnt);
            return;
        }

        if(pl>0)
            dfs(pl-1, mi, mu, di, deph+1, cnt+arr[deph]);
        if(mi>0)
            dfs(pl, mi-1, mu, di, deph+1, cnt-arr[deph]);
        if(mu>0)
            dfs(pl, mi, mu-1, di, deph+1, cnt*arr[deph]);
        if(di>0)
            dfs(pl, mi, mu, di-1, deph+1, (int)cnt/arr[deph]);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n;i++)
            arr[i] = sc.nextInt();
        int pl = sc.nextInt();
        int mi = sc.nextInt();
        int mu = sc.nextInt();
        int di = sc.nextInt();
        sc.close();
        
        visited = new boolean[n];
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        dfs(pl,mi,mu,di,1,arr[0]);

        System.out.println(max);
        System.out.println(min);
    }
    
}
