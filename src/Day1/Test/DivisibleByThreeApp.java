package Test;

import java.util.Scanner;

public class DivisibleByThreeApp {
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = inputCollector.nextInt();

        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3.");
        }

        if (number % 3 != 0) {
            System.out.println(number + " is not divisible by 3.");
        }


        inputCollector.close();
    }


}