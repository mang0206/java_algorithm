package backjun.Carray2;

import java.util.Scanner;
import java.util.StringTokenizer;
public class 세로읽기 {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     StringTokenizer[] arr = new StringTokenizer[5];
        
    //     int cnt = 0;
    //     for(int i=0;i<5;i++){
    //         String[] t = sc.nextLine().split("");
    //         StringBuilder sb = new StringBuilder();
    //         for(String s:t)
    //             sb.append(s+ " ");
    //         StringTokenizer st = new StringTokenizer(sb.toString(), " ");
    //         arr[i] = st;
    //         cnt += st.countTokens();
    //     }
    //     while(cnt >= 0){
    //         for(int i=0; i<5;i++){
    //             --cnt;
    //             if (arr[i].hasMoreTokens()){
    //                 System.out.print(arr[i].nextToken());
    //             }
    //         }
    //     }
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for(int i=0; i<5;i++){
            String s = sc.nextLine();
            for(int j=0; j<s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }
        sc.close();

        for(int i=0; i<15;i++){
            for(int j=0; j<5;j++){
                if(arr[j][i] != '\0') {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
    
}
