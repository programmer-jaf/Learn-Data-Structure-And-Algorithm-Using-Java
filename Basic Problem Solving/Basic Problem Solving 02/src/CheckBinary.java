// * Question Link: https://www.geeksforgeeks.org/problems/check-for-binary/1?selectedLang=java

public class CheckBinary {
  // Method to check if a string is binary (contains only 0s and 1s)
  static boolean isBinary(String s) {
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch != '0' && ch != '1') return false;
    }
    return true;
  }

  public static void main(String[] args) {
    // Sample test cases
    String test1 = "101010";
    String test2 = "12345";

    System.out.println("Is \"" + test1 + "\" binary : " + isBinary(test1)); // true
    System.out.println("Is \"" + test2 + "\" binary : " + isBinary(test2)); // false
  }
}
