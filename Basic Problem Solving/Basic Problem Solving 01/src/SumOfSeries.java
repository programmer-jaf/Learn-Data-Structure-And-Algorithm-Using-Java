// * Question Link: https://www.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty=School&sortBy=submissions

public class SumOfSeries {

  // Brute-force solution using loop
  public static int seriesSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  // Optimized solution using formula: n(n + 1) / 2
  public static int optimizedSeriesSum(int n) {
    return n * (n + 1) / 2;
  }

  public static void main(String[] args) {
    int n = 10;

    System.out.println("Sum of first " + n + " natural numbers (Loop): " + seriesSum(n));
    System.out.println("Sum of first " + n + " natural numbers (Optimized): " + optimizedSeriesSum(n));
  }
}
