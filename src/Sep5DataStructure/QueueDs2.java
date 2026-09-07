package Sep5DataStructure;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDs2 {
    public void task1(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(89);
        queue.add(90);
        System.out.println("FIFO: " + queue.remove());
        System.out.println("Peek: " + queue.peek());
    }
}
