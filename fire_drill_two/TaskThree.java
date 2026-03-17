package fire_drill_two;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 scores and prints the sum and average.");
        System.out.println("");

        int i = 0;
        int sum = 0;
        while (i++ < 10) {
            System.out.print("Enter score " + i + ": ");
            int score = inputCollector.nextInt();
            sum = sum + score;
        }

        double average = (double) sum / 10;

        System.out.println("");
        System.out.println("Sum of the score is: " + sum);
        System.out.println("Average of the score is: " + average);
        System.out.println("Done!");

        inputCollector.close();
    }
}