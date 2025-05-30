public class BreakAndContinue {
  public static void main(String[] args) {
    System.out.println("Learn about break and continue statement");

    // ----------- break statement -----------
    // The break keyword is used to terminate the loop when a condition is met
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println("break statement: " + i);
    }

    System.out.println(); // Spacer for clarity

    // ----------- continue statement -----------
    // The continue keyword is used to skip the current iteration of the loop
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.println("continue statement: " + i);
    }
  }
}
