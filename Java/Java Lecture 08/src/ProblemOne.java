import java.util.Scanner;

public class ProblemOne {
  public static void main(String[] args) {
    System.out.println("Problem One: Count the number of digits in a given number");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    // Handle negative numbers
    num = Math.abs(num);

    // Special case for 0
    if (num == 0) {
      System.out.println("Number of digits: 1");
      return;
    }

    int count = 0;
    while (num > 0) {
      num /= 10;
      count++;
    }

    System.out.println("Number of digits: " + count);
  }
}
