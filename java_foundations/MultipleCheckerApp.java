import java.util.Scanner;

    public class MultipleCheckerApp {
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = inputCollector.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = inputCollector.nextInt();

        int firstNumberTripled = firstNumber * 3;
        int secondNumberDoubled = secondNumber * 2;


        if (firstNumberTripled % secondNumberDoubled == 0) {
            System.out.println(firstNumberTripled + " (first tripled) is a multiple of " + secondNumberDoubled + " (second doubled)");
        }

        if (firstNumberTripled % secondNumberDoubled != 0) {
            System.out.println(firstNumberTripled + " (first tripled) is not a multiple of " + secondNumberDoubled + " (second doubled)");
        }

        inputCollector.close();
    }

}