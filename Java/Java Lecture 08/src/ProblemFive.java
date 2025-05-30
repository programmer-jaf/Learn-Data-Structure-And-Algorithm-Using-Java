import java.util.Scanner;
public class ProblemFive {
  public static void main(String[] args) {
    System.out.println("Problem Five: find the factorial of a given number");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    // Handle negative numbers
    num = Math.abs(num);

    // Special case for 0
    if (num == 0) {
      System.out.println("Factorial: 1");
      return;
    }

    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }

    System.out.println("Factorial: " + fact);
  }
}
