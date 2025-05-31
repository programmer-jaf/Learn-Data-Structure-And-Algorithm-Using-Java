import java.util.Scanner;

public class Pattern__07 {
  public static void main(String[] args) {
    System.out.println("Pattern Problem: Zig-Zag Number Pattern");

    Scanner sc = new Scanner(System.in);

    // Input for number of rows and columns
    System.out.println("Enter the number of rows:");
    int row = sc.nextInt();

    System.out.println("Enter the number of columns:");
    int col = sc.nextInt();

    // Logic to print the zig-zag number pattern
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("2 ");
        }
      }
      System.out.println();
    }

    sc.close();
  }
}
