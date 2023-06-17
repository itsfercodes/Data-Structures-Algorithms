package arrays;

import java.util.*;

public class Exercises {

  // Create a function that reverses a string
  static String reverse(String str) {
    // There are two solutions
    // 1) traverse the string bakwards and use an empty string
    // to store the characters. Time O(n), Space O(n)
    // 2) Use two pointers to switch the characters in place
    // Time O(n), Space O(1)

    char[] strArr = str.toCharArray();
    int leftPointer = 0;
    int rightPointer = strArr.length - 1;

    while (leftPointer < rightPointer) {
      char temp = strArr[leftPointer];
      strArr[leftPointer] = strArr[rightPointer];
      strArr[rightPointer] = temp;
      leftPointer++;
      rightPointer--;
    }
    return new String(strArr);
  }

  // Create a function that merge two sorted arrays, we can asume they a both
  // integers. Time O(n + m), Space O(n + m)
  static int[] mergeArrays(int[] arr1, int[] arr2) {

    if (arr1.length == 0)
      return arr2;
    if (arr2.length == 0)
      return arr1;

    int[] result = new int[arr1.length + arr2.length];

    int p1 = 0, p2 = 0;

    for (int i = 0; i < result.length; i++) {

      if (arr1[p1] < arr2[p2]) {
        result[i] = arr1[p1];
        if (p1 == arr1.length - 1)
          arr1[p1] = Integer.MAX_VALUE;
        else
          p1++;
      } else {
        result[i] = arr2[p2];
        if (p2 == arr2.length - 1)
          arr2[p2] = Integer.MAX_VALUE;
        else
          p2++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(reverse("Hello world!"));
    System.out.println(reverse("I'm a reversed string!"));

    System.out.println(Arrays.toString(mergeArrays(new int[] { 0, 3, 4, 32 }, new int[] { 4, 6, 30 })));
    System.out.println(Arrays.toString(mergeArrays(new int[] { 0, 3, 4, 32 }, new int[] {})));
  }
}
