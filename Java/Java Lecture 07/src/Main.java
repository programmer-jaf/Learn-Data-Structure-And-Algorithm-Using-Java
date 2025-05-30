public class Main {
  public static void main(String[] args) {
    System.out.println("Learn about Loops");
    // What is a loop?
    // A loop is a programming construct that allows you to repeat a block of code
    // multiple times.
    // There are 3 types of loops in Java
    /*
      1. for loop
      2. while loop
      3. do-while loop
    */

    // ----------- for loop -----------
    for (int i = 0; i < 5; i++) {
      System.out.println("for loop: " + i);
    }

    // ----------- while loop -----------
    int j = 0;
    while (j < 5) {
      System.out.println("while loop: " + j);
      j++;
    }

    // ----------- do-while loop -----------
    int k = 0;
    do {
      System.out.println("do-while loop: " + k);
      k++;
    } while (k < 5);
  }
}
