import java.util.Scanner;

public class ProblemTwo {
  public static void main(String[] args) {
    System.out.println("Problem Two : find the number of sum of the digits for a given number");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    // Handle negative numbers
    num = Math.abs(num);

    // Special case for 0
    if (num == 0) {
      System.out.println("Sum of digits: 0");
      return;
    }

    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }

    System.out.println("Sum of digits: " + sum);
  }
}
