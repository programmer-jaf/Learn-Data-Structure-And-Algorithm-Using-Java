import java.util.Scanner;

public class Pattern__03 {
  public static void main(String[] args) {
    System.out.println("Pattern Problem: Numerical Triangle");

    Scanner sc = new Scanner(System.in);

    // Input number of rows
    System.out.print("Enter the number of rows: ");
    int row = sc.nextInt();

    // Generate numerical triangle pattern
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
