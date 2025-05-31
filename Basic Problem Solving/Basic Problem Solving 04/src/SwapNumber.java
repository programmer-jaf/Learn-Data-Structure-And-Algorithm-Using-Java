// * Question Link: https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1?selectedLang=c

import java.util.ArrayList;
import java.util.List;

public class SwapNumber {

  // Swaps two integers and returns them as a list
  static List<Integer> swapNumber(int a, int b) {
    int temp = a;
    a = b;
    b = temp;

    List<Integer> result = new ArrayList<>();
    result.add(a); // Swapped value of a
    result.add(b); // Swapped value of b
    return result;
  }

  public static void main(String[] args) {
    List<Integer> swapped = swapNumber(5, 10);
    System.out.println("Swapped numbers: " + swapped); // Output: [10, 5]
  }
}
