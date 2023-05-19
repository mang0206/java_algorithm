package backjun.I그리디;

import java.util.Scanner;

public class 잃어버린괄호 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split("\\-");
        sc.close();

        int sum = 0;
        for(int t=0; t<s.length; t++){
            String[] i = s[t].split("\\+");
            int tmp = 0;
            for(String j:i){
                tmp += Integer.parseInt(j);
            }
            if(t==0) sum += tmp;
            else sum -= tmp;
        }

        System.out.println(sum);

    }
}
