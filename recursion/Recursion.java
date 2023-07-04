package recursion;

public class Recursion {

  static String inception(int counter) {
    System.out.println(counter);
    if (counter > 3) {
      return "Reached base case: counter is 4";
    }
    return inception(counter + 1);
  }

  public static void main(String[] args) {
    System.out.println(inception(0));
  }
}
