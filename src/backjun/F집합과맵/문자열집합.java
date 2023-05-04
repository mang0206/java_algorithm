package backjun.F집합과맵;

import java.util.Scanner;
import java.util.HashMap;
public class 문자열집합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m= sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<n;i++){
            String s = sc.next();
            map.put(s, null);
        }
        int cnt = 0;
        for(int i=0; i<m; i++){
            String s = sc.next();
            if(map.containsKey(s)) ++cnt;
        }
        sc.close();

        System.out.println(cnt);


    }
    
}
