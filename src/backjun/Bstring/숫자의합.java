package backjun.Bstring;

import java.util.Scanner;
public class 숫자의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // String[] s = sc.next().split("");
        // for(int i=0; i<n;i++)
        //     arr[i] = Integer.parseInt(s[i]);

        // int sum = 0;
        // for(int i: arr)
        //     sum = sum+ i;
        // System.out.println(sum);

        String s = sc.next();
        int sum = 0;
        for(int i=0;i<s.length(); i++)
            sum += s.charAt(i) - 48;

        System.out.print(sum);
        sc.close();
    }
    
}
