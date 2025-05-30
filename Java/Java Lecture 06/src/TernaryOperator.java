public class TernaryOperator {
  public static void main(String[] args) {
    System.out.println("Learn about ternary operator in Java\n");

    // ----------- Syntax -----------
    // condition ? expression_if_true : expression_if_false;

    // ----------- Example 1: Simple age check -----------
    int age = 20;
    String result = (age >= 18) ? "You are an adult" : "You are a minor";
    System.out.println("Age check: " + result);

    // ----------- Example 2: Find maximum of two numbers -----------
    int a = 10;
    int b = 15;
    int max = (a > b) ? a : b;
    System.out.println("Maximum value: " + max);

    // ----------- Example 3: Even or odd -----------
    int number = 7;
    String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
    System.out.println("Number check: " + evenOdd);
  }
}
