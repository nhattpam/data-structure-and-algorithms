package queue.data.structure;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        // Queue = FIFO data structure. First-In First-Out (ex: a line of people)
        //          A collection designed for holding elements prior to processing
        //          Linear data structure
        //          add = enqueue, offer()
        //          remove = dequeue, poll()
        
        Queue<String> queue = new LinkedList<String>();
        
        System.out.println(queue.isEmpty());
        
        //offer = add to queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        
        //xac dinh object dung dau tien (vao dau tien)
        System.out.println(queue.peek()); //-> Karen
        
        //poll = xoa ra khoi queue
        //queue.poll();
        
        //tim kiem trong quque
        System.out.println(queue.contains("Chad2"));
        
        System.out.println(queue);
        
    }
    
}
