package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

  // Write two functions that calculate the factorial of a number in a recursive
  // and iterative way
  static int findFactorialRecursive(int number) { // O(n)
    if (number == 2) {
      return number;
    }
    return number * findFactorialRecursive(number - 1);
  }

  static int findFactorialIterative(int number) {
    int result = 1;
    for (int i = 2; i <= number; i++) { // O(n)
      result *= i;
    }
    return result;
  }

  // Given a number N, return the index value of the Fibonacic sequence, where the
  // sequence is the sum of the 2 previous value

  static List<Integer> fibonacciIterative(int num) { // O(n)
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1));
    for (int i = 2; i <= num; i++) {
      arr.add(arr.get(i - 2) + arr.get(i - 1));
    }
    return arr;
  }

  static int fibonacciRecursive(int num) { // O(n ^ 2)
    if (num < 2)
      return num;

    return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
  }

  public static void main(String[] args) {
    System.out.println(findFactorialRecursive(5));
    System.out.println(findFactorialIterative(5));

    System.out.println(fibonacciIterative(43));
    System.out.println(fibonacciRecursive(43));
  }
}
