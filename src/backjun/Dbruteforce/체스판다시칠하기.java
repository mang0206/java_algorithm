package backjun.Dbruteforce;

import java.util.Scanner;

public class 체스판다시칠하기 {
    static char[][] board;

    static int checkchess(int x, int y){
        int start_w =0, start_b = 0;

        for(int i=x; i<x+8;i++) {
            for(int j=y; j<y+8;j++){
                if((i+j)%2 == 0){
                    if(board[i][j]=='B')
                        ++start_b;
                    else
                        ++start_w;
                    
                } else {
                    if(board[i][j]=='B')
                        ++start_w;
                    else
                        ++start_b;
                }
            }
        }
        return Math.min(start_b, start_w);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), m = sc.nextInt();

        board = new char[n][m];

        for(int i =0;i<n;i++){
            String wb = sc.next();
            for(int j=0; j<m;j++){
                board[i][j] = wb.charAt(j);
            }
        }
        sc.close();
        int result = Integer.MAX_VALUE;
        for(int i=0; i<n-7;i++){
            for(int j=0; j<m-7;j++){
                result = Math.min(checkchess(i,j), result);
            }
        }
        System.out.println(result);
    }
    
}
