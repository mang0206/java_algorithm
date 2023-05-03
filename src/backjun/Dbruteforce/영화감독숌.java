package backjun.Dbruteforce;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 0;
        int cnt = 0;

        while (cnt < n){
            i++;
            // if (Integer.toString(i).contains("666")) {
            if(String.valueOf(i).contains("666")){
                cnt++;
            }
        }
        System.out.println(i);

    }
    
}
