package backjun;

// import java.util.PriorityQueue;
import java.util.*;
public class test {
    public static void main(String[] args){
        int[][] arr = {{1,5}, {9,3}, {2, 7}, {0, 9}};
        Arrays.sort(arr, (o1, o2) -> { return o2[0] - o1[0];});

        for(int i=0;i<4;i++){
            Arrays.stream(arr[i]).forEach(a -> {System.out.print(a + " ");});
            System.out.println();
        }
    }
}
