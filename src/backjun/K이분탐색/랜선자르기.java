package backjun.K이분탐색;

import java.util.Scanner;
import java.util.Arrays;

public class 랜선자르기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt();
        int[] line = new int[k];

        for(int i=0; i<k;i++){
            line[i] = sc.nextInt();
        }

        sc.close();
        
        long start = 1, end = Arrays.stream(line).max().getAsInt();
        long mid = 0;
        while(start <= end){
            mid = (start + end) / 2;
            long cnt = 0;
            for(long i:line)
                cnt += i / mid;

            if(cnt < n)
                end = mid-1;
            else
                start = mid + 1;
            
        }
        System.out.println(end);

    }
}
