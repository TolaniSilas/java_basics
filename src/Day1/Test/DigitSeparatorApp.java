package Test;

import java.util.Scanner;

public class DigitSeparatorApp {
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter a five-digit integer. (For example, 56893) : ");
        int number = inputCollector.nextInt();

        int firstDigit  = number/ 10000;
        int secondDigit = number / 1000 % 10;
        int thirdDigit  = number / 100 % 10;
        int fourthDigit = number / 10 % 10;
        int fifthDigit  = number % 10;

        System.out.printf("%d   %d   %d   %d   %d %n", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);

        inputCollector.close();
    }


}