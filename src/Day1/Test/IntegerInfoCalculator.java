package Test;

import java.util.Scanner;

public class IntegerInfoCalculator {
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your first integer: ");
        int firstNumber = inputCollector.nextInt();

        System.out.print("Enter your second integer: ");
        int secondNumber = inputCollector.nextInt();

        System.out.print("Enter your third integer: ");
        int thirdNumber = inputCollector.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;  
        int product = firstNumber * secondNumber * thirdNumber;


        int smallestNumber = firstNumber;
        if (smallestNumber > secondNumber) {
            smallestNumber = secondNumber;
        }

        if (smallestNumber > thirdNumber) {
            smallestNumber = thirdNumber;
        }

        int largestNumber = firstNumber;
        if (largestNumber < secondNumber) {
            largestNumber = secondNumber;
        }

        if (largestNumber < thirdNumber) {
            largestNumber = thirdNumber;
        }

        System.out.println("Sum of the three integers: " + sum);
        System.out.println("Average of the three integers: " + average);
        System.out.println("Product of the three integers: " + product);
        System.out.println("Smallest among the three integers: " + smallestNumber);
        System.out.println("Largest among the three integers: " + largestNumber);

        inputCollector.close();
    }


}