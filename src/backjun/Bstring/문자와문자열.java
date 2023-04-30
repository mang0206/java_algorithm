package backjun.Bstring;

import java.util.Scanner;
public class 문자와문자열 {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     String s = sc.next();
    //     int i = sc.nextInt();

    //     System.out.print(s.charAt(i-1));
    //     sc.close();

    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.next().split("");
        int i = sc.nextInt();

        System.out.print(s[i-1]);
        sc.close();

    }
}
