package backjun.Bstring;

import java.util.Scanner;
public class 문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String s = sc.next();
            System.out.println(s.charAt(0) +"" +s.charAt(s.length()-1));
        }

        // for(int i=0;i<n;i++){
        //     String[] s = sc.next().split("");
        //     System.out.println(s[0] + s[s.length -1]);
        // }
        sc.close();
    }
}
