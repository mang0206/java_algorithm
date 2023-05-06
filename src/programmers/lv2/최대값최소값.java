package programmers.lv2;
import java.util.PriorityQueue;
import java.util.Collections;

public class 최대값최소값 {
    public String solution(String s) {
        String answer = "";
        String[] S = s.split(" ");
        PriorityQueue<Integer> mi = new PriorityQueue<>();
        PriorityQueue<Integer> ma = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String i:S){
            int t = Integer.parseInt(i);
            mi.add(t);
            ma.add(t);
        }
            
        answer += mi.poll() + " " + ma.poll();
        return answer;
    }
}
