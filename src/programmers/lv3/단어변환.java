package programmers.lv3;

import java.util.*;

public class 단어변환{
    public boolean check(String a, String b){
        int cnt = 0;
        int l = a.length();
        for(int i=0; i<l;i++){
            if(a.charAt(i) == b.charAt(i))
                cnt++;
        }
        if(cnt +1 == l)
            return true;
        else
            return false;
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        Deque<String[]> q = new LinkedList<>();
        q.add(new String[] {begin,"0"});
        
        while(!q.isEmpty()){
            String tmp = q.peek()[0], deph = q.peek()[1];
            int d = Integer.valueOf(deph);
            q.poll();

            if(tmp.equals(target))
                return d;
            
            for(int i=0; i< words.length; i++){
                if(!visited[i] && check(tmp, words[i])){
                    // System.out.println(deph + words[i]);
                    visited[i] = true;
                    q.add(new String[] {words[i], String.valueOf(d+1)});
                }
            }
            
        }
        
        return answer;
    }
}
