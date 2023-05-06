package backjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;

public class JavaStructure {
    public static void main(String[] args){
        // 1.Int를 String으로 2. String을 Int로
        // 1. Integer.toString
        // 2. Integer.parseInt

        List<Integer> list1 = new ArrayList<>();
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list2 = Arrays.asList(arr);
        System.out.println(list1);
        System.out.println(list2);

        list1.add(6);

        try{
            list2.add(7);
        } catch(Exception e1) {
            System.out.println("asList로 생성된 List는 고정이다. add, remove 할 수 없다.");
        }

        System.out.println(list1);
        System.out.println(list2);

        list1.add(1);
        list1.add(2);

        Collections.sort(list1);
        Collections.reverse(list1);

        System.out.println(list1);
        
        list1.remove(0);
        int[] arr2 = new int[list1.size()];
        for(int i=0; i<list1.size(); i++) arr2[i] = list1.get(i);
        System.out.println(arr2[1]);

        System.out.println("여기서 부터는 Set 실습");
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);

        System.out.println("여기서부터는 Stack 실습");
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(4);
        stack.push(9);

        System.out.println(stack.get(2));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println("여기서부터는 Deque 실습");

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(11);
        deque.addLast(12);
        System.out.println(deque);
        
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        Iterator<Integer> it = deque.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +" ");
        }
    }
}
