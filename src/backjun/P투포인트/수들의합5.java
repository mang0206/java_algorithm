package backjun.P투포인트;

import java.util.Scanner;
public class 수들의합5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int[] arr = new int[n+1];
        for(int i=1; i<=n;i++)
            arr[i] = i;
        int left = 0, right = 0;

        int t_sum = 0;
        int cnt = 0;
        while(left <= n & right <= n){
            if(t_sum <= n){
                if(t_sum == n)
                    cnt++;
                right++;
                if(right <= n)
                    t_sum += arr[right];
            } else {
                t_sum -= arr[left];
                left++;
            }
        }
        System.out.println(cnt);

    }
}
