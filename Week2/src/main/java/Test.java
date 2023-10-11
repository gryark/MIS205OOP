import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please write i value:");
    double Value1 = scanner.nextDouble();
    System.out.println("Please write j value:");
    double secondValue = Value1 + scanner.nextDouble();
    System.out.println("Please write k value:");
    double thirdValue = scanner.nextDouble() + 1;

    System.out.println("thirdValue is "  + thirdValue +  " and secondValue is " +
        secondValue + " and " + "firstValue is " + Value1);

  }
}
