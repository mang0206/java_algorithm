package backjun_dabi.chapter01;

import java.util.Scanner;
import java.util.Arrays;
public class 일곱난쟁이 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] k = new int[9];
        for(int i =0; i<9;i++)
            k[i] = sc.nextInt();
        sc.close();

        int tmp;
        int idx;
        int[] result;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(i == j)
                    continue;
                idx = 0;
                tmp = 0;
                result = new int[7];
                for(int t=0; t<9; t++){
                    if(i == t | j == t | idx == 7)
                        continue;
                    tmp += k[t];
                    result[idx] = k[t];
                    idx++;
                }
                if(tmp == 100 & idx == 7){
                    Arrays.sort(result);
                    for(int z=0; z<7;z++)
                        System.out.println(result[z]);
                    return;
                }
                    
            }
        }
    }
    
}
