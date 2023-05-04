package backjun.F집합과맵;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
public class 회사에있는사람 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());

        int n= sc.nextInt();
        // sc.next();
        for(int i=0; i<n;i++){
            // String[] t = sc.nextLine().split(" ");
            // String m = t[0];
            String m = sc.next(); sc.next();
            if (map.containsKey(m)) {
				map.remove(m);
			} else {
				map.put(m, 0);
			}
        }

        sc.close();
        
        for(String i:map.keySet())
            System.out.println(i);
    }
}
