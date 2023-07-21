package stackqueue;

public class Main {
  public static void main(String[] args) {
    Stack myStack = new Stack();
    Queue myQueue = new Queue();

    myStack.push(1);
    System.out.println(myStack.peek());
    myStack.push(3);
    System.out.println(myStack.peek());
    myStack.push(5);
    System.out.println(myStack.peek());
    System.out.println(myStack.pop());
    myStack.push(2);
    System.out.println(myStack.peek());

    System.out.println("=======================");
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.enqueue(4);
    System.out.println(myQueue.peek());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.peek());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.peek());
    System.out.println(myQueue.dequeue());
    System.out.println(myQueue.peek());

  }
}
