package arrays;

import java.util.ArrayList;

public class Example {
  public static void main(String[] args) {
    // Static array declaration knowing the data it will hold, fixed in size
    int[] staticArray = { 1, 2, 3, 4, 5 };

    // Static array declaration not knowing the data it will hold, but knowing the
    // quantity of data
    // int[] staticArray = new int[5];

    // Dynamic array declaration
    ArrayList<Integer> dynamicArray = new ArrayList<>();

    /* ========== Operations ========== */

    // Write
    // It can write at any position while it is a valid one
    staticArray[0] = 10; // O(1)

    // Default behavior is to add at the end, but if we first put the index it will
    // write it at that position
    dynamicArray.add(1); // O(1)
    // dynamicArray.add(0, 10); // O(n)

    // Read
    int content = staticArray[2]; // content = 3, O(1)
    content = dynamicArray.get(0); // content = 1, O(1)

  }
}