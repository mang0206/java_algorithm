package backjun_dabi.chapter02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 멀티탭스케줄링 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> dic = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[k];
        for(int i=0; i<k;i++) {
            arr[i]= sc.nextInt();
            if(dic.containsKey(arr[i])){
                dic.put(arr[i], dic.get(arr[i])+1);
            } else {
                dic.put(arr[i], 1);
            }
        }
        // System.out.println(dic);
        sc.close();

        int result = -n;
        for(k=0; k<arr.length; k++){
            int i = arr[k];
            if(list.size()<n & !list.contains(i)) {
                result++;
                list.add(i);
            } else {
                if(list.contains(i)){
                    dic.put(i, dic.get(i)-1);
                    if(k != arr.length-1 & dic.get(i) == 1){
                        list.remove(list.indexOf(i));
                    }
                } else {
                    result++;
                    int min = dic.get(list.get(0));
                    int min_idx = 0;
                    for(int x=1; x<list.size(); x++) {
                        if(min > dic.get(list.get(x))){
                            min = dic.get(list.get(x));
                            min_idx = x;
                        }
                    }
                    // System.out.println(min);
                    list.remove(min_idx);
                    list.add(i);
                }
            }
        }
        
        System.out.println(result >= 0 ? result : 0);

    }
}
