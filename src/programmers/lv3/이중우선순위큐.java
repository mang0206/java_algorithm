package programmers.lv3;

import java.util.*;

class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minq = new PriorityQueue<>();
        PriorityQueue<Integer> maxq = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> maxq = new PriorityQueue<>();
        int len = 0;
        for(String s: operations){
            String[] tmp = s.split(" ");
            if(tmp[0].equals("I")){
                len++;
                minq.add(Integer.valueOf(tmp[1]));
                maxq.add(Integer.valueOf(tmp[1]));
                
            } else {
                if(len == 0)
                    continue;
                len--;
                if(tmp[1].equals("-1")){
                    minq.poll();
                } else {
                    maxq.poll();
                }
                if(len==0){
                    minq = new PriorityQueue<>();
                    maxq = new PriorityQueue<>(Collections.reverseOrder());
                }
            }
        }
        if(len>0){
            return new int[] {maxq.peek(),minq.peek()};
        } else{
            return new int[] {0,0};
        }
        
    }
}