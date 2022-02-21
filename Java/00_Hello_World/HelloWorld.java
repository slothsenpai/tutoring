import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
  private static final int SEVEN = 7;
  public static void main(String[] args) throws IOException {
    System.out.println("Please enter a number: ");
    Scanner scan = new Scanner(System.in);
    try {
      int number = scan.nextInt();
      int sum = SEVEN + number;
      System.out.println("Your sum is: " + sum);
    } catch(InputMismatchException ime) {
      System.out.println("You didn't enter a number!");
    }
    scan.close();
  }
}