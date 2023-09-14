package backjun_dabi.chapter02;

import java.util.Scanner;

public class 빗물 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] maps = new int[h][w];

        int k;
        for(int i=0; i<w;i++){
            k = sc.nextInt();
            for(int j=0; j<k;j++){
                maps[j][i] = 1;
            }
        }
        sc.close();

        int result = 0;
        for(int i=0; i<h;i++){
            int left = 0, right = 1;
            while(left < w & right < w){
                if(maps[i][right] == 1) {
                    if(maps[i][left] == 1)
                        result += right - left -1;
                    left = right;
                }
                right++;
            }
        }
        System.out.println(result);
    }
}
