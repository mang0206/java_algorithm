package programmers.lv2;

public class N_Queen {
    public static int N;
    public static int[] chess;
    public static int result;
    
    public static boolean check(int idx, int num){
        for(int i=0; i<idx; i++){
            if (chess[i] == num)
                return false;
            
            if(Math.abs(num - chess[i]) == Math.abs(i - idx))
                return false;
        }
        return true;
    }
    
    public static void dfs(int deph){
        if(deph == N) {
            // for(int i=0; i<N;i++){
            //     System.out.print(chess[i] + " ");
            // }
            // System.out.println();
            result++;
            return;
        }
        for(int i=0; i<N;i++){
            if(check(deph, i)){
                chess[deph] = i;
                dfs(deph+1);
                chess[deph] = 0;
            }
        }
        
    }
    public int solution(int n) {
        result = 0;
        N = n;
        chess = new int[n];
        
        dfs(0);
        
        return result;
    }
}
