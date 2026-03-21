package Test;

import java.util.Scanner;

public class IntegerMinMax {
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your first integer: ");
        int firstNumber = inputCollector.nextInt();

        System.out.print("Enter your second integer: ");
        int secondNumber = inputCollector.nextInt();

        System.out.print("Enter your third integer: ");
        int thirdNumber = inputCollector.nextInt();

        System.out.print("Enter your fourth integer: ");
        int fourthNumber = inputCollector.nextInt();

        System.out.print("Enter your fifth integer: ");
        int fifthNumber = inputCollector.nextInt();


        int smallestNumber = firstNumber;
        if (secondNumber < smallestNumber) {
            smallestNumber = secondNumber;
        }

        if (thirdNumber < smallestNumber) {
            smallestNumber = thirdNumber;
        }

        if (fourthNumber < smallestNumber) {
            smallestNumber = fourthNumber;
        }

        if (fifthNumber < smallestNumber) {
            smallestNumber = fifthNumber;
        }


        int largestNumber = firstNumber;
        if (secondNumber > largestNumber) {
            largestNumber = secondNumber;
        }

        if (thirdNumber > largestNumber) {
            largestNumber = thirdNumber;
        }

        if (fourthNumber > largestNumber) {
            largestNumber = fourthNumber;
        }

        if (fifthNumber > largestNumber) {
            largestNumber = fifthNumber;
        }

        System.out.println("Smallest Integer: " + smallestNumber);
        System.out.println("Largest Integer: "  + largestNumber);

        inputCollector.close();
    }

}