package stackqueue;

import java.util.ArrayList;

public class Stack {

  private ArrayList<Integer> stack;

  public Stack() {
    this.stack = new ArrayList<>();
  }

  public int peek() {
    return stack.get(stack.size() - 1);
  }

  public void push(int element) {
    stack.add(element);
  }

  public int pop() {
    int elementRemoved = stack.remove(stack.size() - 1);
    return elementRemoved;
  }

}
