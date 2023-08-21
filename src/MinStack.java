import java.util.Stack;

public class MinStack {

  //Create a stack TODO this is just the blueprint
  //Testing making changes and reversing changes
  Stack<Integer> stack = new Stack<>();
    public MinStack() {

    }

    private void push (int num) {
      stack.push(num);
    }

    private void pop () {
      stack.pop();
    }

    public int top() {
      return stack.peek();
    }



}
