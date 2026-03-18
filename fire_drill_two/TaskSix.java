package fire_drill_two;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 scores and prints the average of even numbers.");
        System.out.println("");

        int i = 0;
        int evenSum = 0;
        int evenCount = 0;
        while (i++ < 10) {
            System.out.print("Enter score " + i + ": ");

            int score = inputCollector.nextInt();
            if (score % 2 == 0) {
                evenSum = evenSum + score;
                evenCount = evenCount + 1;
            }
        }

        System.out.println("");
        if (evenCount > 0) {
            int average = (int) evenSum / evenCount;
            System.out.println("Average of even numbers: " + average);

        } else if (evenCount == 0) {
            System.out.println("No even numbers entered.");
        }

        System.out.println("Done!");

        inputCollector.close();
    }
}