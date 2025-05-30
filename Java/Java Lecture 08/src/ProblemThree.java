import java.util.Scanner;

public class ProblemThree {
  public static void main(String[] args) {
    System.out.println("Problem Three: Reverse the digit of a given number");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();
    
    // Handle negative numbers
    num = Math.abs(num);

    // Special case for 0
    if (num == 0) {
      System.out.println("Reversed number: 0");
      return;
    }

    int reversed = 0;
    while (num > 0) {
      reversed = reversed * 10 + num % 10;
      num /= 10;
    }
    
    System.out.println("Reversed number: " + reversed);
  }
}
