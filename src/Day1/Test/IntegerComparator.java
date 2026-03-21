import java.util.Scanner;

public class IntegerComparator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();

        int square = number * number;

        if (number > 100) {
            System.out.println(number + " is greater than 100.");
        }

        if (number == 100) {
            System.out.println(number + " is equal to 100.");
        }

        if (number != 100) {
            System.out.println(number + " is not equal to 100.");
        }

        if (number < 100) {
            System.out.println(number + " is less than 100.");
        }

        
        if (square > 100) {
            System.out.println("Its square (" + square + ") is greater than 100.");
        }

        if (square == 100) {
            System.out.println("Its square (" + square + ") is equal to 100.");
        }

        if (square != 100) {
            System.out.println("Its square (" + square + ") is not equal to 100.");
        }

        if (square < 100) {
            System.out.println("Its square (" + square + ") is less than 100.");
        }

        inputCollector.close();
    }


}