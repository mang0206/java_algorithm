package programmers.lv3;

class 정수삼격형 {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];
        dp[0] = new int[] {triangle[0][0]};
        int max = 0;
        
        for(int i=1; i<triangle.length;i++){
            dp[i] = new int[i+1];
            for(int j=0; j<=i; j++){
                if(j==0)
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                else if(j==i)
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]) + triangle[i][j];
                if(dp[i][j] > max)
                    max = dp[i][j];
            }
        }
        
        return max;
    }
}
