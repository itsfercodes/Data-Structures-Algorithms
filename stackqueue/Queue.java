package stackqueue;

public class Queue {

  private int length;
  private Node first;
  private Node last;

  public Queue() {
    length = 0;
    first = null;
    last = null;
  }

  public void enqueue(int value) {
    if (first == null) {
      first = new Node(value);
      last = first;
    } else {
      last.next = new Node(value);
      last = last.next;
    }
    length++;
  }

  public int peek() {
    return first.data;
  }

  public Integer dequeue() {
    if (length <= 0) {
      return null;
    }
    Node temp = first;
    first = first.next;
    temp.next = null;
    length--;
    return temp.data;
  }

}
