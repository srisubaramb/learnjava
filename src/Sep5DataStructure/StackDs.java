package Sep5DataStructure;

class Stack{
    int[] arr = new int[5];
    int top = -1;
    void push(int a){
        if (top == 4) return;
        top++;
        arr[top] = a;
    }
    int pop(){
        if(top < 0) return 0;
        int val = arr[top];
        top--;
        return val;
    }
    int peek() {
        if(top < 0) return 0;
        return arr[top];
    }
}
public class StackDs {
    public void task1(){
        Stack stack = new Stack();
        stack.push(90);
        stack.push(99);
        System.out.println("Popped " + stack.pop());
        System.out.println("Peek element " + stack.peek());
    }
}
