import java.util.Scanner;

public class Pattern__01 {
  public static void main(String[] args) {
    System.out.println("Print Rectangular Pattern");

    Scanner sc = new Scanner(System.in);

    // Input rows
    System.out.print("Enter the number of rows: ");
    int row = sc.nextInt();

    // Input columns
    System.out.print("Enter the number of columns: ");
    int col = sc.nextInt();

    // Outer loop for rows
    for (int i = 1; i <= row; i++) {
      // Inner loop for columns
      for (int j = 1; j <= col; j++) {
        System.out.print("* ");
      }
      System.out.println(); // Move to next line after each row
    }

    sc.close();
  }
}
