import java.util.Scanner;

public class MultiplicationImplementation {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A simple program that performs multiplication of two numbers without using the '*' sign...");

        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();

        int result = 0;

        if (firstNumber == 0 || secondNumber == 0) {
            result = 0;

        } 
        
        else {
            int i = 0;
            while (i < Math.abs(firstNumber)) {
                result += Math.abs(secondNumber);
                i++;
            }

            if ((firstNumber < 0 && secondNumber > 0) || (firstNumber > 0 && secondNumber < 0)) {
                result = -result;
            }
        }

        System.out.println("");
        System.out.println("The multiplication of " + firstNumber + " and " + secondNumber + " is " + result);
        System.out.println("Done!");

        inputCollector.close();
    }
}