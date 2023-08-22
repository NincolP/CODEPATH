import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {

  //Create a stack TODO this is just the blueprint
  //Testing making changes and reversing changes
  Stack<Integer> s = new Stack<>();

  //The min stack will only store the min value on top of this stack
  Stack<Integer> m = new Stack<>();

    public void push (int num) {
      s.push(num);
      if(m.empty() || num < m.peek())
        m.push(num);
      else
        m.push(m.peek());
    }

    public void pop () {
      s.pop();
      m.pop();

    }

    public int top() {
      return s.peek();
    }

    public int getMin() {
      return m.peek();
    }





}
