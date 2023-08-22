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
        if(!stack2.isEmpty()) {
            stack2.pop();
        }
    }

    public int peek() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if(!stack2.isEmpty())
            return stack2.peek();
        else
            return 0;
    }

    public boolean empty() {
        return stack2.isEmpty();
    }

}
