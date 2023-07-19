package programmers.lv3;
class Solution {
    public int solution(int sticker[]) {
        int l = sticker.length;
        
        if(l==1)
            return sticker[0];
        if(l==2)
            return Math.max(sticker[0], sticker[1]);
        
        int[] dp1 = new int[l];
        int[] dp2 = new int[l];

        dp1[0] = sticker[0];
        dp2[1] = sticker[1];
        for(int i=2; i<l; i++){
            dp1[i] = Math.max(sticker[i] + dp1[i-2], dp1[i-1]);
            dp2[i] = Math.max(sticker[i] + dp2[i-2], dp2[i-1]);
        }

        return Math.max(dp1[l-2], dp2[l-1]);
    }
}
