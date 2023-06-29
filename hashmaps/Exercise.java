package hashmaps;

import java.util.HashSet;
import java.util.Set;

// Given an array of numbers, return the first recurring character
public class Exercise {

  // Time complexity: O(n)
  // Space complexity: O(n)
  static Integer solution(int[] nums) {
    Set<Integer> lookup = new HashSet<>();

    for (int num : nums) {
      if (!lookup.add(num)) {
        return num;
      }
    }
    return null;
  }

  public static void main(String[] args) {

    System.out.println(solution(new int[] { 2, 5, 1, 2, 3, 5, 1, 2, 4 }));
    System.out.println(solution(new int[] { 2, 1, 1, 2, 3, 5, 1, 2, 4 }));
    System.out.println(solution(new int[] { 2, 3, 4, 5 }));
  }
}
