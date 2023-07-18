package programmers.lv3;

class 등굣길 {
    static int[] dx = {1, 0};
    static int[] dy = {0, 1};
    static int[][] maps;
    static int[][] dp;
    static int X;
    static int Y;
    static void dfs(int x, int y){
        if(x==X-1 & y==Y-1){
            dp[x][y] = 1;
            return;
        }
        
        if(dp[x][y] != -1)
            return;
        
        dp[x][y] = 0;
        
        for(int i=0; i<2; i++){
            int nx=x+dx[i], ny = y +dy[i];
            if(nx>= 0 && nx < X && ny >= 0 && ny <Y &&maps[x][y]==0){
                dfs(nx,ny);
                dp[x][y] = (dp[x][y] + dp[nx][ny]) % 1000000007;
            }
        }
        
    }
    public int solution(int m, int n, int[][] puddles) {
        maps = new int[n][m];
        dp = new int[n][m];
        X = n;
        Y = m;
        
        for(int i=0; i<puddles.length; i++){
            int x = puddles[i][1], y = puddles[i][0];
            maps[x-1][y-1] = 1;
        }
        for(int i=0; i<X; i++){
            for(int j=0; j<Y; j++){
                dp[i][j] = -1;
            }
        }
        
        dfs(0,0);
        
        return dp[0][0] % 1000000007;
    }
}