package backjun.K이분탐색;

import java.util.Scanner;
import java.util.Arrays;
public class 나무자르기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] tree = new int[n];

        for(int i=0; i<n; i++){
            tree[i] = sc.nextInt();
        }
        sc.close();
        long start = 0, end = Arrays.stream(tree).max().getAsInt()+1;

        long mid = 0;
        while(start < end){
            mid = (start + end) / 2;

            long cut = 0;
            for(long i:tree){
                if(i > mid){
                    cut += i - mid;
                }
            }

            if (cut < m){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(start -1);
    }
    
}
