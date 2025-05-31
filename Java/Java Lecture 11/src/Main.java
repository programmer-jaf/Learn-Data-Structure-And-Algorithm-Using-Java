public class Main {

  // Define a Car class
  public static class Car {
    // Properties / Fields
    String name;
    int price;
    int release_year;
    int wheel_count;
    int doors;

    // Behaviors / Methods
    void accelerate() {
      System.out.println("The car is accelerating...");
    }

    void steering() {
      System.out.println("The car's wheel is steering...");
    }

    void stop() {
      System.out.println("The car has stopped.");
    }
  }

  public static void main(String[] args) {
    System.out.println("Learn about OOP: Class and Objects");

    // Create an object of Car
    Car car = new Car();

    // Set object properties using dot operator
    car.name = "BMW";
    car.price = 1400000;
    car.doors = 4;
    car.release_year = 2023;
    car.wheel_count = 4;

    // Access and display properties
    System.out.println("Car brand: " + car.name);
    System.out.println("Price: $" + car.price);
    System.out.println("Doors: " + car.doors);
    System.out.println("Release Year: " + car.release_year);
    System.out.println("Wheels: " + car.wheel_count);

    // Call object methods
    car.accelerate();
    car.steering();
    car.stop();
  }
}
