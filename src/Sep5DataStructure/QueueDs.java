package Sep5DataStructure;

class Queue{
    private int[] arr = new int[5];
    private int front = 0;
    private int rear = -1;

    public void enqueue(int a){
        if(rear == arr.length - 1) return;
        rear++;
        arr[rear] = a;
    }
    //mimicking the deque by moving front
    public int dequeue(){
        if(front > rear) return 0;
        int val = arr[front];
        front++;
        return val;
    }
    public int peek(){
        return arr[front];
    }
}
public class QueueDs {
    public void task1(){
        Queue queue = new Queue();
        queue.enqueue(34);
        queue.enqueue(35);
        System.out.println("FIFO : " + queue.dequeue());
        System.out.println("Peek : " + queue.peek());
    }
}
