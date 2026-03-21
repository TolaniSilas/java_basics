package Test;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter your first integer: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter your second integer: ");
        int secondNumber = inputCollector.nextInt();

        int squareFirstNumber = firstNumber * firstNumber;
        int squareSecondNumber = secondNumber * secondNumber;
        int sumOfSquares = squareFirstNumber + squareSecondNumber;
        int diffOfSquares = squareFirstNumber - squareSecondNumber;

        System.out.println("Square of first number: " + squareFirstNumber);
        System.out.println("Square of second number: " + squareSecondNumber);
        System.out.println("Sum of their squares: " + sumOfSquares);
        System.out.println("Difference of the squares: " + diffOfSquares);

        inputCollector.close();

        }
    
    }