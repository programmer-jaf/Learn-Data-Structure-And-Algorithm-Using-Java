import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    System.out.println("Conversion:Decimal to binary");
    Scanner sc = new Scanner(System.in);
    int decimal = sc.nextInt();
    int decimalSaved = decimal;  // Save the original value for final output
    String binary = "";  // To store the binary digits as a string

    if (decimal == 0) {
      binary = "0";  // Special case for 0
    }

    // Convert decimal to binary manually
    while (decimal > 0) {
      int remainder = decimal % 2;  // Get the remainder (binary digit)
      binary = remainder + binary;  // Prepend the remainder (build binary string)
      decimal /= 2;  // Divide decimal by 2
    }

    System.out.println("The Binary value of " + decimalSaved + " is : " + binary);
    sc.close();
  }
}
