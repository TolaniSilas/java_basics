import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        int weightPounds = inputCollector.nextInt();

        System.out.print("Enter your height in inches: ");
        int heightInches = inputCollector.nextInt();

        int bmi = weightPounds * 703 / (heightInches * heightInches);

        System.out.println("Your BMI is: " + bmi);
        System.out.println();
        System.out.println("BMI Categories From National Heart, Lung and Blood Institute:");
        System.out.println("Underweight: BMI < 18.5");
        System.out.println("Healthy: BMI 18.5 - 24.9");
        System.out.println("Overweight: BMI 25.0 - 29.9");
        System.out.println("Obesity: BMI >= 30");

        inputCollector.close();
    }
}