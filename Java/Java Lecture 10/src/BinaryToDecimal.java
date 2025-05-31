import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    System.out.println("Conversion: Binary to Decimal");
    Scanner sc = new Scanner(System.in);

    // Read binary number
    int binary = sc.nextInt();
    int binarySaved = binary; // Save the original value before modifying

    int base = 1;    // Represents 2^0
    int decimal = 0;

    while (binary > 0) {
      int lastDigit = binary % 10;
      decimal += lastDigit * base;
      base *= 2;
      binary /= 10;
    }

    System.out.println("The Decimal value of " + binarySaved + " is : " + decimal);
    sc.close();
  }
}
