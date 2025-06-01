// * Question Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

public class Question__01 {
  // 1. Brute Force
  static int LargestElementBrute(int arr[]) {
    int n = arr.length;
    if (n == 1) return arr[0];  // ✅ Fixed this line

    int largestElement = arr[0];
    for (int i = 1; i < n; i++) {  // ✅ Start from index 1
      if (arr[i] > largestElement)
        largestElement = arr[i];
    }
    return largestElement;
  }

  public static void main(String[] args) {
    System.out.println("Question: Largest Element in an Array");

    int[] arr = {4, 10, 2, 8, 6};
    int result = LargestElementBrute(arr);
    System.out.println("Largest element: " + result);
  }
}
