import java.util.Scanner;

public class Pattern__04 {
  public static void main(String[] args) {
    System.out.println("Pattern Problem: Hollow Rectangular");

    // Scanner to take input
    Scanner sc = new Scanner(System.in);

    // Input for number of rows and columns
    int row = sc.nextInt();
    int col = sc.nextInt();

    // Loop to print hollow rectangle pattern
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        if (i == 1 || i == row || j == 1 || j == col) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // Close the scanner
    sc.close();
  }
}
