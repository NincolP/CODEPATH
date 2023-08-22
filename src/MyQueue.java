import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void push(int n) {
       stack1.push(n);
    }

    public void pop() {
        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        stack2.pop();
    }

    public void peek() {
        if(!stack2.isEmpty())
            stack2.peek();
    }

    public boolean empty() {
        return stack2.isEmpty();
    }

}
