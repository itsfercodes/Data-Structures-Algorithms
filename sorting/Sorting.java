package sorting;

public class Sorting {

  // Time complexity: O(n^2)
  // Space complexity: O(1)
  public static int[] bubbleSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      // Traverse the numsay until the last number that is not sorted
      for (int j = 0; j < nums.length - i - 1; j++) {
        // Move the greatest number to the left
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    return nums;
  }

  // Time complexity: O(n^2)
  // Space complexity: O(1)
  public static int[] selectionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int lowestNumberIndex = i;
      // Traverse the array and save the index of the lowest number
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[lowestNumberIndex]) {
          lowestNumberIndex = j;
        }
      }
      // Swap the lowest number to the current index
      int temp = nums[lowestNumberIndex];
      nums[lowestNumberIndex] = nums[i];
      nums[i] = temp;
    }
    return nums;
  }

  // Time complexity: O(n^2)
  // Space complexity: O(1)
  public static int[] insertionSort(int[] nums) {
    for (int i = 1; i < nums.length; ++i) {
      int key = nums[i];
      int j = i - 1;

      // Move backwards and move all the elements greater that key one position ahead
      while (j >= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j = j - 1;
      }
      nums[j + 1] = key;
    }
    return nums;
  }

  // Time complexity: O(n log n)
  // Space complexity: O(n)
  public static int[] mergeSort(int nums[], int left, int right) {
    if (left < right) {

      // Find the middle point
      int middle = left + (right - left) / 2;

      // Sort first and second halves
      mergeSort(nums, left, middle);
      mergeSort(nums, middle + 1, right);

      // Merge the sorted halves
      merge(nums, left, middle, right);
    }

    return nums;
  }

  // Merges two subarrays of nums[].
  // First subarray is nums[left..middle]
  // Second subarray is nums[middle+1..right]
  private static void merge(int nums[], int left, int middle, int right) {
    // Find sizes of two subarrays to be merged
    int n1 = middle - left + 1;
    int n2 = right - middle;

    // Create temp arrays
    int L[] = new int[n1];
    int R[] = new int[n2];

    // Copy data to temp arrays
    for (int i = 0; i < n1; ++i)
      L[i] = nums[left + i];
    for (int j = 0; j < n2; ++j)
      R[j] = nums[middle + 1 + j];

    // Merge the temp arrays
    // Initial indices of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarray array
    int k = left;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        nums[k] = L[i];
        i++;
      } else {
        nums[k] = R[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of L[] if any
    while (i < n1) {
      nums[k] = L[i];
      i++;
      k++;
    }

    // Copy remaining elements of R[] if any
    while (j < n2) {
      nums[k] = R[j];
      j++;
      k++;
    }
  }

}
