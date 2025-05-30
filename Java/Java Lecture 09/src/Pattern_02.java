import java.util.Scanner;

public class Pattern_02 {
  public static void main(String[] args) {
    System.out.println("Pattern Problem: Numerical Rectangular");

    Scanner sc = new Scanner(System.in);

    // Take input for rows and columns
    System.out.print("Enter the number of rows: ");
    int row = sc.nextInt();

    System.out.print("Enter the number of columns: ");
    int col = sc.nextInt();

    // Generate the pattern
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= col; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
