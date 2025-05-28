public class Main {
  public static void main(String[] args) {
    System.out.println("variables in java");
    /*
    Variables --> Variables are container to store values.For Example, if you want to store milk you have to store it into a bottle

    Naming convention
      1. UPPERCASE
      2. lowercase
      3. camelCase

    function/methods + variables --> camelCase
    class --> PascalCase
    constant --> snake__case

    Rules while creating variables
      1. Variables can't start with number and special characters.
      2. Variables name must be start with characters, underscore(_) and dollars ($).
      3. Variables name can't be a keyword.
      4. Variables name can't contain white-spaces
      5. it's better that variables name should be meaningful.
    */
    int a = 10;
    System.out.println(a);
  /*
    Data types in Java
    1. Primitive
      1. byte
      2. short
      3. int
      4. long
      5. char
      6. double
      7. float
      8. boolean
    2. Non-Primitive
      1. strings
      2. functions/methods
      3. array
      4. classes
      5. interface
 */
//    byte
    byte byteValue = 127;
    System.out.println(byteValue);
//    short
    short shortValue = 32656;
    System.out.println(shortValue);
//    int
    int integerValue = 625432541;
    System.out.println(integerValue);
//    long
    long longValue = 52469846567459684L; // add L at the end
    System.out.println(longValue);
//    char
    char ch = 'a';
    System.out.println(ch);
//    float
    float floatingValue = 32.5415f; // add f at the end
    System.out.println(floatingValue);
//    double
    double doubleValue = 5142.56146964456; // it's not mandatory to add d at the end
    System.out.println(doubleValue);
//    boolean
    boolean booleanValue = true;
    System.out.println(booleanValue);
  }
}
