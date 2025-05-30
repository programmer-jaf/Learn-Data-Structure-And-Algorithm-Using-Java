public class Main {
  public static void main(String[] args) {
    System.out.println("Learn about Operators in Java");
    // What is an Operator
    // Operators are special symbols or special keyword to operate something on variables and values
    // There are 6 Types of operators in Java
    /*
      1. assignment operators
      2. arithmetic operators
      3. logical operators
      4. relational operators
      5. bitwise operators
      6. unary operators
    */
//    1. assignment operators are --> =,+=,-=,*=,/=,%=
    int a = 10;
    int b = 5;
    System.out.println(a=b);
    System.out.println(a+=b);
    System.out.println(a-=b);
    System.out.println(a*=b);
    System.out.println(a/=b);
    System.out.println(a%=b);
//    2. arithmetic operators are --> +,-,*,/,%
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
//    3. relational operators are --> >,>=,<,<=,==,!=
    System.out.println(a>b);
    System.out.println(a>=b);
    System.out.println(a<=b);
    System.out.println(a==b);
    System.out.println(a!=b);
//    4. logical operators are --> &&,||,!
    System.out.println((a>b)&&(a!=b));
    System.out.println((a>b)||(a!=b));
//    5. bitwise operators are --> &,|,!
//    6. Unary operators are --> +, -


  }
}
