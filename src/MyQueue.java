import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    //Constructor
    public MyQueue () {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //Pushing new items into stack 1
    public void push(int n) {
       stack1.push(n);
    }

    //Popping items from stack 2 after they have move from stack 1 to stack 2
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

    //Peeking top of the stack from stack 2
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

    //See if stack 2 is empty
    public boolean empty() {
        return stack2.isEmpty();
    }

}
