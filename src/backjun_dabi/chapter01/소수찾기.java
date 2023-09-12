package backjun_dabi.chapter01;

import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();

        int cnt = 0;
        boolean flag;
        for(int i:arr){
            flag = true;
            if (i == 1) {
                continue;
            }
            for(int j=2; j <(int)Math.sqrt(i)+1; j++){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                cnt++;
        }

        System.out.println(cnt);
    }
    
}
