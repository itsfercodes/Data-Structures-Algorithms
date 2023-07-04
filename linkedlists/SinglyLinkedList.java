package linkedlists;

import java.io.Console;

public class SinglyLinkedList<T> {
  // Attributes
  private Node<T> head;
  private Node<T> tail;
  private int length = 0;

  // Constructors
  public SinglyLinkedList() {
    head = null;
    tail = null;
  }

  public SinglyLinkedList(T data) {
    head = new Node<T>(data);
    tail = head;
    length = 1;
  }

  // Methods
  private void setHead(T data) {
    head = new Node<T>(data);
    tail = head;
    length = 1;
  }

  public void append(T data) {
    if (head == null) {
      setHead(data);
    } else {
      Node<T> newNode = new Node<T>(data);
      tail.next = newNode;
      tail = newNode;
      length++;
    }
  }

  public void prepend(T data) {
    if (head == null) {
      setHead(data);
    } else {
      Node<T> newNode = new Node<T>(data);
      newNode.next = head;
      head = newNode;
      length++;
    }
  }

  /**
   * Zero based index
   */
  public void insert(int index, T data) {
    // Edge cases
    if (head == null) {
      setHead(data);
      return;
    }
    if (index == 0) {
      prepend(data);
      return;
    }
    if (index == length - 1) {
      append(data);
      return;
    }
    if (index > length - 1 || index < 0) {
      System.out.println("\033[4;31m" + "Invalid index" + "\033[0m");
      return;
    }

    // Traverse the linked list until the desired position - 1 position
    int currentPosition = 0;
    Node<T> currentNode = head;
    Node<T> newNode = new Node<T>(data);
    while (currentPosition < index - 1) {
      currentNode = currentNode.next;
      currentPosition++;
    }

    Node<T> temp = currentNode.next;
    currentNode.next = newNode;
    newNode.next = temp;
    length++;
  }

  /**
   * Zero based index
   */
  public void remove(int index) {
    // Edge cases
    if (index > length - 1 || index < 0) {
      System.out.println("\033[4;31m" + "Invalid index" + "\033[0m");
      return;
    }
    if (index == 0) {
      Node<T> temp = head;
      head = head.next;
      temp.next = null;
      length--;
      return;
    }

    // Traverse the linked list until the desired position - 1 position
    int currentPosition = 0;
    Node<T> currentNode = head;
    while (currentPosition < index - 1) {
      currentNode = currentNode.next;
      currentPosition++;
    }
    if (index == length - 1) {
      tail = currentNode;
      tail.next = null;
      return;
    }
    Node<T> temp = currentNode.next;
    currentNode.next = currentNode.next.next;
    temp = null;
    length--;

  }

  public void printList() {
    Node<T> pointer = this.head;
    while (pointer != null) {
      System.out.print(pointer.data + " -> ");
      pointer = pointer.next;
    }
    System.out.println("null");
  }

  // Getters
  public Node<T> getHead() {
    return head;
  }

  public Node<T> getTail() {
    return tail;
  }

  public int getLength() {
    return length;
  }

}
