package programmers.lv3;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class 불량사용자 {
    static HashSet<List> answer;
    static String[] user;
    static String[] banned;
    static boolean[] visited;
    
    boolean check(String u, String b){
        if (u.length() != b.length()) return false;
            
        for(int i=0; i<u.length(); i++){
            if(b.charAt(i) == '*') continue;
            if(u.charAt(i) != b.charAt(i)) return false;
        }
    
        
    return true;
}

void dfs(int idx){
    if(idx == banned.length){
        List<String> tmp = new ArrayList<>();
        for(int i=0; i<visited.length;i++){
            if(visited[i]) tmp.add(user[i]);
        }
        
        answer.add(tmp);
        return;
    }
    
    for(int i=0; i<user.length;i++){
        if(!visited[i] & check(user[i], banned[idx])){
            visited[i] = true;
            dfs(idx + 1);
            visited[i] = false;
        }
    }
}

int solution(String[] user_id, String[] banned_id) {
    answer = new HashSet<>();
    user = user_id;
    banned = banned_id;
    
    visited = new boolean[user_id.length];
    dfs(0);
    System.out.println(answer);
    return answer.size();
}
}
