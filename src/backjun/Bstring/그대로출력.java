package backjun.Bstring;

import java.util.Scanner;

public class 그대로출력 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = sc.nextLine();
            if (s == null | s.isEmpty())
                break;
            
            sb.append(s + '\n');
        }

        System.out.print(sb);
        sc.close();
    }
    
}
