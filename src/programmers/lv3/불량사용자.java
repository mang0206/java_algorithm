package programmers.lv3;

import java.util.*;
class Solution {
    static String[] u_id;
    static String[] b_id;
    static boolean[] visited;
    static int B;
    static Set<String> set;
    
    static boolean check(String a, String b){
        if(a.length() != b.length())
            return false;
        
        for(int i=0; i<a.length(); i++){
            if(b.charAt(i) == '*')
                continue;
            else if(a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }
        
    static void dfs(int b_idx){
        if(b_idx == B){
            StringBuilder s = new StringBuilder();
            for(int i=0; i<u_id.length;i++)
                if(visited[i])
                    s.append(String.valueOf(i));
            set.add(s.toString());
            return;
        }
        
        for(int i=0; i<u_id.length;i++){
            if(!visited[i] && check(u_id[i], b_id[b_idx])){
                visited[i] = true;
                dfs(b_idx+1);
                visited[i] = false;
            }
        }
    }
    public int solution(String[] user_id, String[] banned_id) {
        u_id = user_id;
        b_id = banned_id;
        visited = new boolean[u_id.length];
        B = b_id.length;
        set = new HashSet<>();
        
        dfs(0);
        
        return set.size();
    }
}