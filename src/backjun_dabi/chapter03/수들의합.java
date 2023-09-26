package backjun_dabi.chapter03;

import java.util.Scanner;
public class 수들의합 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long cnt = 0;
        long idx = 0;
        while(cnt+idx < n){
            idx++;
            cnt += idx;
        }
        System.out.println(idx);
    }
}
