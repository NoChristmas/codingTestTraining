package Algorithm;

import java.util.Queue;
import java.util.LinkedList;

public class TrainQueue {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>(); //String형 queue 선언, linkedlist 이용
        queue.add("My");
        queue.add("Name");
        queue.add("Is");
        queue.add("Park");
        
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.peek());

        System.out.println(queue.size());
    }


}
