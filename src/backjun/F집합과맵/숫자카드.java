package backjun.F집합과맵;

import java.util.Scanner;
import java.util.HashMap;

public class 숫자카드 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n;i++){
            int num = sc.nextInt();
            map.put(num, 0);
        }
        int m = sc.nextInt();
        StringBuffer bf = new StringBuffer();
        for(int i=0; i<m;i++){
            int t = sc.nextInt();
            if(map.containsKey(t))
                bf.append(1 + " ");
            else
                bf.append(0 + " ");
        }
        sc.close();
        System.out.print(bf);

    }
    
}
