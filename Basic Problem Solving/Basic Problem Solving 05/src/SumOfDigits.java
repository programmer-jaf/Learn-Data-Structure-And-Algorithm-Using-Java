// * Question Link: https://www.geeksforgeeks.org/problems/sum-of-digits1742/1?page=3&difficulty=School&sortBy=submissions

public class SumOfDigits {

  // Method to calculate the sum of digits of a number n
  static int sumOfDigits(int n) {
    if (n < 10) {
      return n; // If the number is a single digit, return it as is
    }

    int sum = 0;
    while (n != 0) {
      sum += n % 10; // Add the last digit to sum
      n /= 10;       // Remove the last digit
    }

    return sum;
  }

  public static void main(String[] args) {
    // Test cases to validate the sum of digits method
    System.out.println(sumOfDigits(1234)); // Output: 10
    System.out.println(sumOfDigits(9));    // Output: 9
    System.out.println(sumOfDigits(999));  // Output: 27
    System.out.println(sumOfDigits(5));    // Output: 5
  }
}
