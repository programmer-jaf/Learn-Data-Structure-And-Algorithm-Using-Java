public class Conditionals {
  public static void main(String[] args) {
    System.out.println("Learn about conditionals\n");

    // What is a conditional?
    // A conditional is a programming construct that executes code
    // based on whether a specified condition is true or false.

    // ----------- if statement -----------
    int myAge = 18;
    if (myAge >= 18) {
      System.out.println("if statement: You can drive");
    }

    // ----------- if-else statement -----------
    if (myAge >= 18) {
      System.out.println("if-else statement: You can drive");
    } else {
      System.out.println("if-else statement: You can't drive");
    }

    // ----------- if-else-if-else statement -----------
    String day = "Saturday";
    if (day.equals("Saturday")) {
      System.out.println("if-else-if: The day is Saturday");
    } else if (day.equals("Sunday")) {
      System.out.println("if-else-if: The day is Sunday");
    } else {
      System.out.println("if-else-if: The day is not valid");
    }

    // ----------- switch-case statement -----------
    String season = "Summer";
    switch (season) {
      case "Summer":
        System.out.println("switch-case: The season is Summer");
        break;
      case "Rainy":
        System.out.println("switch-case: The season is Rainy");
        break;
      case "Autumn":
        System.out.println("switch-case: The season is Autumn");
        break;
      case "Winter":
        System.out.println("switch-case: The season is Winter");
        break;
      case "Spring":
        System.out.println("switch-case: The season is Spring");
        break;
      default:
        System.out.println("switch-case: The season is not defined");
    }
  }
}
