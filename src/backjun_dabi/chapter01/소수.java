package backjun_dabi.chapter01;

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        sc.close();
        boolean flag;

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=m; i<=n; i++){
            flag = true;
            if(i<=1)
                continue;
            for(int j = 2; j<(int)Math.sqrt(i)+1;j++){
                if (i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else
            System.out.println(-1);
    }
    
}
