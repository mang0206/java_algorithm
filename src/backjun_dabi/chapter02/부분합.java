package backjun_dabi.chapter02;
import java.util.Scanner;

public class 부분합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        long[] arr = new long[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        long np = arr[0];
        int left = 0, right = 0;
        int result = n;
        boolean flag = false;
        while(left < n && right < n){
            // System.out.println(np);
            if(np < s){
                right++;
                if(right < n)
                    np += arr[right];
            } else {
                flag = true;
                result = Math.min(result, right+1 - left);
                np -= arr[left];
                left++;
            }
        }
        System.out.println(flag ? result:0);
    }
    
}
