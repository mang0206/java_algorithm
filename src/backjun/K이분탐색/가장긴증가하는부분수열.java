package backjun.K이분탐색;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class 가장긴증가하는부분수열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n;i++)
            arr[i] = sc.nextInt();
        sc.close();

        List<Integer> l = new ArrayList<>();
        l.add(arr[0]);

        for(int i=1; i<n;i++){
            int t = arr[i];

            if(t> l.get(l.size()-1)){
                l.add(t);
            } else {
                int start = 0, end = l.size()-1;
                int mid = 0;

                while(start<end){
                    mid = (start + end)/2;

                    if(l.get(mid)>=t)
                        end = mid;
                    else
                        start = mid + 1;
                
                }
                l.set(start, t);
            }
        }

        System.out.println(l.size());

    }
    
}
