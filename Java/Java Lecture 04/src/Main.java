import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("learn about inputs in java");
    Scanner sc = new Scanner(System.in);
//  byte
    byte byteValue = sc.nextByte();
    System.out.println(byteValue);
//  short
    short shortValue = sc.nextShort();
    System.out.println(shortValue);
//  int
    int intValue = sc.nextInt();
    System.out.println(intValue);
//  long
    long longValue = sc.nextLong();
    System.out.println(longValue);
//  float
    float floatValue = sc.nextFloat();
    System.out.println(floatValue);
//  double
    double doubleValue = sc.nextDouble();
    System.out.println(doubleValue);
//  char
    char charValue = sc.next().charAt(0);
    System.out.println(charValue);
//  String
    String stringValue = sc.nextLine();
    System.out.println(stringValue);
    sc.close();
  }
}
