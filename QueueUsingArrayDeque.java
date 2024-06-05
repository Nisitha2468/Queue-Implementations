package ml;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		// Adding elements to the queue
        queue.offer(12);
        queue.offer(20);
        queue.offer(25);

        // Removing and printing elements from the queue
        System.out.println(queue.poll());
        
        //Returns the Top Value 
        System.out.println(queue.peek());
        
        
        
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

	}

}
