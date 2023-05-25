package K이분탐색;

import java.util.Scanner;
import java.util.Arrays;
public class 공유기설치 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), c = sc.nextInt();
        int[] house = new int[n];

        for(int i=0; i<n; i++){
            house[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(house);
        
        long start = 1, end = house[n-1] - house[0]+1;

        long mid = 0;
        while(start<end){
            mid = (start+end) / 2;
            long tmp = house[0];
            int cnt = 1;
            for(int i= 1; i<n;i++){
                if (house[i] - tmp >= mid){
                    tmp = house[i];
                    cnt++;
                } 
            }
            if (cnt < c)
                end = mid;
            else
                start = mid+1;
        }

        System.out.println(start-1);

    }
    
}
