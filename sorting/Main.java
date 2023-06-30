package sorting;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };

    long start = System.nanoTime();
    System.out.println(Arrays.toString(Sorting.bubbleSort(nums)));
    long end = System.nanoTime();
    System.out.println("Bubble Sort lasted:" + (end - start) + " nanoseconds");

    nums = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
    start = System.nanoTime();
    System.out.println(Arrays.toString(Sorting.selectionSort(nums)));
    end = System.nanoTime();
    System.out.println("Selection Sort lasted:" + (end - start) + " nanoseconds");

    nums = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
    start = System.nanoTime();
    System.out.println(Arrays.toString(Sorting.insertionSort(nums)));
    end = System.nanoTime();
    System.out.println("Insertion Sort lasted:" + (end - start) + " nanoseconds");

    nums = new int[] { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };
    start = System.nanoTime();
    System.out.println(Arrays.toString(Sorting.mergeSort(nums, 0, nums.length - 1)));
    end = System.nanoTime();
    System.out.println("Merge Sort lasted:" + (end - start) + " nanoseconds");
  }
}
