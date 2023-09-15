package backjun_dabi.chapter02;
import java.util.Scanner;

public class 부분합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++)
            arr[i]= sc.nextInt();
        sc.close();
        int left = 0, right = 0;

        int cnt = Integer.MAX_VALUE;
        int tmp = arr[0];

        while(left < n && right < n){
            // System.out.println(left +" " + right + " " + tmp);
            if(tmp < s) {
                right++;
                if(right < n)
                    tmp += arr[right];
            } else {
                cnt = Math.min(cnt, right+1-left);
                left++;
                if(left<n)
                    tmp -= arr[left];
            }
        }
        System.out.println(cnt);

    }
    
}
