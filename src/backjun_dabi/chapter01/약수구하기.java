package backjun_dabi.chapter01;

import java.util.Scanner;

public class 약수구하기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        sc.close();

        int[] result = new int[n];
        int idx = 0;
        for(int i=1; i<=n;i++){
            if(n % i == 0){
                result[idx] = i;
                idx++;
            }
            if(idx == k)
                break;
        }
        if(idx == k)
            System.out.println(result[k-1]);
        else
            System.out.println(0);
    }
}
