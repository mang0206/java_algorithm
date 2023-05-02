package backjun.Dbruteforce;

import java.util.Scanner;
public class 분해합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int result = 0;

        for(int i=1;i<n;i++){
            String t = Integer.toString(i);
            int tmp = i;
            for(int j=0; j<t.length(); j++)
                tmp += ((int)t.charAt(j) - '0');
            
            if (tmp == n){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
    
}
