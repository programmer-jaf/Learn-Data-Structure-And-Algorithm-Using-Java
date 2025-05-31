import java.util.Scanner;

public class Pattern_06 {
  public static void main(String[] args) {
    System.out.println("Pattern Problem: Numerical Rectangular");

    // Scanner to take input
    Scanner sc = new Scanner(System.in);

    // Input for number of rows
    int row = sc.nextInt();

    // Loop to print numerical rectangular pattern
    for (int i = 1; i <= row; i++) {
      // Print numbers from i to row
      for (int j = i; j <= row; j++) {
        System.out.print(j);
      }

      // Print numbers from 1 to i - 1
      for (int k = 1; k <= (i - 1); k++) {
        System.out.print(k);
      }

      System.out.println();
    }

    // Close the scanner
    sc.close();
  }
}
