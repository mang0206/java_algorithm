package backjun.Esorting;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class 좌표압축 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] sort = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sort[i] = arr[i];
        }
        sc.close();

        Arrays.sort(sort);
        HashMap<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for(int i:sort){
            if(!map.containsKey(i)){
                map.put(i, idx++);
            }
        }

        for(int i: arr)
            System.out.print(map.get(i) +" ");

    }
}
