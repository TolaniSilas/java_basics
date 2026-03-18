package fire_drill_two;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 scores and prints the sum of even indexes.");
        System.out.println("");

        int i = 0;
        int evenSum = 0;
        while (i++ < 10) {
            System.out.print("Enter score " + i + ": ");
            int score = inputCollector.nextInt();
            if (i % 2 == 0) {
                evenSum = evenSum + score;
            }
        }

        System.out.println("");
        System.out.println("Sum of even indexes: " + evenSum);
        System.out.println("Done!");

        inputCollector.close();
    }
}