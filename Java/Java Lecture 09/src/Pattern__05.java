import java.util.Scanner;

public class Pattern__05 {
  public static void main(String[] args) {
    System.out.println("Pattern Problem: Inverted Triangle");

    // Scanner to take input
    Scanner sc = new Scanner(System.in);

    // Input for number of rows
    int row = sc.nextInt();

    // Loop to print inverted triangle pattern
    for (int i = row; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // Close the scanner
    sc.close();
  }
}
