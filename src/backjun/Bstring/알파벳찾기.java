package backjun.Bstring;

import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;
public class 알파벳찾기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // List<Integer> a = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char i='a'; i<='z'; i++){
            // a.add(s.indexOf(i));
            sb.append(s.indexOf(i) + " ");
        }
        // System.out.println(a);
        System.out.println(sb);
        
        sc.close();
    }
    
}

// public class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String[] s = sc.next().split("");
        
//         int[] a = new int['z'-'a'+1];
//         for(int i=0; i<a.length; i++)
//             a[i] = -1;

//         for(char i='a'; i<='z'; i++){
//             for(int j=0; j<s.length; j++){
//                 if(i==s[j].charAt(0)){
//                     a[i - 97] = j;
//                     break;
//                 }
//             }
//         }
//         for(int i:a)
//             System.out.print(i + " ");
//         sc.close();
//     }
    
// }
