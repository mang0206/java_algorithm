package programmers.lv3;

import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = {1, gems.length};
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        
        int l = gems.length;
        for(int i=0;i<l;i++)
            set.add(gems[i]);
        int count = set.size();
        
        int left = 0, right = 0;
        while(left < l && right < l+1){
            if (map.size() == count){
                if (right - left - 1 < answer[1] - answer[0]) {
                    answer[0] = left+1;
                    answer[1] = right;
                }
                String gem = gems[left];
                map.put(gem, map.get(gem)-1);
                if(map.get(gem) == 0){
                    map.remove(gem);
                }
                left++;
                
            } else {
                if(right ==l)
                    break;
                String gem = gems[right];
                if(map.containsKey(gem))
                    map.put(gem, map.get(gem)+1);
                else
                    map.put(gem, 1);
                right++;
            }
        }
        
        return answer;
    }
}