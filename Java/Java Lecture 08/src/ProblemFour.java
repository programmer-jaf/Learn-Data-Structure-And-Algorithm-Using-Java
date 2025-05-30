import java.util.Scanner;

public class ProblemFour {
  public static void main(String[] args) {
    System.out.println("Problem Four: Find the sum of the following series (even and odd alternating)");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    // Handle negative numbers
    num = Math.abs(num);

    // Special case for 0
    if (num == 0) {
      System.out.println("Sum of series: 0");
      return;
    }

    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += (i % 2 == 0) ? i : -i;
    }

    System.out.println("Sum of series: " + sum);
  }
}
