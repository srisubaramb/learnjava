package Sep5DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDs2 {
    public void task1(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(23);
        stack.pop();
        stack.push(24);
        stack.peek();
    }
}
