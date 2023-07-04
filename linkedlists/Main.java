package linkedlists;

public class Main {
  public static void main(String[] args) {
    SinglyLinkedList<Integer> myFirstList = new SinglyLinkedList<>();

    myFirstList.append(2);
    myFirstList.append(5);
    myFirstList.append(6);
    myFirstList.printList();
    System.out.println("List length: " + myFirstList.getLength());
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

    myFirstList.prepend(10);
    myFirstList.prepend(15);
    myFirstList.printList();
    System.out.println("List length: " + myFirstList.getLength());
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

    myFirstList.insert(2, 4);
    myFirstList.insert(-1, 4);
    myFirstList.printList();
    System.out.println("List length: " + myFirstList.getLength());
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

    myFirstList.remove(2);
    myFirstList.remove(-1);
    myFirstList.printList();
    System.out.println("List length: " + myFirstList.getLength());
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

    myFirstList.remove(0);
    myFirstList.printList();
    System.out.println("List length: " + myFirstList.getLength());
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

    myFirstList.remove(3);
    myFirstList.printList();
    System.out.println("List length: " + myFirstList.getLength());
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

    myFirstList.append(12);
    myFirstList.append(99);
    myFirstList.append(144);

    myFirstList.printList();
    myFirstList.reverse();
    myFirstList.printList();
    System.out.println("List head: " + myFirstList.getHead().data);
    System.out.println("List tail: " + myFirstList.getTail().data);

  }
}
