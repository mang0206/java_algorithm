package programmers.lv3;

import java.util.*;
class 단속카메라 {
    public int solution(int[][] routes) {
        int answer = 0;
        
        Arrays.sort(routes, (o1, o2) -> {
            return o1[1]-o2[1];
        });
        
        int result_e = -Integer.MAX_VALUE;
        for(int i=0; i<routes.length; i++){
            int start = routes[i][0], end = routes[i][1];
            if(start > result_e){
                result_e = end;
                answer++;
            }
            
        }
        return answer;
    }
}