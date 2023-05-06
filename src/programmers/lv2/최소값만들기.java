package programmers.lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class 최소값만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> b = new ArrayList<>();
        
        for(int i:B)
            b.add(i);
        
        Arrays.sort(A);
        Collections.sort(b);
        Collections.reverse(b);
        for(int i=0;i<b.size(); i++)
            B[i] = b.get(i);
        
        int tmp = 0;
        for(int i=0;i<A.length; i++){
            tmp = A[i] * B[i];
            answer += tmp;
        }

        return answer;
    }
}
