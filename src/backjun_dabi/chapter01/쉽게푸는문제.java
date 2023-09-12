package backjun_dabi.chapter01;

import java.util.Scanner;

public class 쉽게푸는문제 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), e = sc.nextInt();
        sc.close();

        int idx = 1;
        int cnt = 1;
        int[] arr = new int[1001];
        while(idx<=1000){
            for(int j=0; j<cnt;j++) {
                arr[idx] = cnt;
                idx++;
                if(idx == 1001)
                    break;
            }
            cnt++;
        }
        int sum = 0;
        for(int i = s; i<=e;i++)
            sum += arr[i];
        System.out.println(sum);
    }
    
}
