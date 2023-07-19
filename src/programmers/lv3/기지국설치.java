package programmers.lv3;

// import java.util.*;

// 시간초과 코드
// class Solution {
//     public int solution(int n, int[] stations, int w) {
//         int answer = 0;

//         boolean[] visited = new boolean[n];
//         for(int i:stations){
//             for(int j=w;j>0;j--){
//                 if(i-j-1 >= 0)
//                     visited[i-j-1] = true;
//             }
//             visited[i-1] = true;
//             for(int j=0;j<w;j++){
//                 if(i+j <n)
//                     visited[i+j] = true;
//             }
//         }
        
//         int idx = 0;
//         while(idx < n){
//             if(!visited[idx]){
//                 for(int i=0; i<w*2+1;i++)
//                     if(i+idx<n)
//                         visited[i+idx] = true;
//                 answer++;
//                 if(idx + w < n)
//                     idx += w;
//                 continue;
//             }
//             idx++;
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int idx = 1;
        
        while(idx <= n){
            if(si<stations.length && idx >= stations[si] - w){
                idx = stations[si] + w + 1;
                si++;
            } else {
                answer++;
                idx += 2*w + 1;
            }
        }
        
        return answer;
    }
}