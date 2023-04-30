package backjun.Bstring;

import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        System.out.print((int)a);

        sc.close();
    }
}
