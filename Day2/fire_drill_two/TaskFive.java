import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 scores and prints the sum of even numbers.");
        System.out.println("");

        int i = 0;
        int evenSum = 0;
        while (i++ < 10) {
            System.out.print("Enter score " + i + ": ");
            int score = inputCollector.nextInt();

            if (score % 2 == 0) {
                evenSum = evenSum + score;
            }
        }

        System.out.println("");
        System.out.println("Sum of even numbers: " + evenSum);

        System.out.println("Done!");

        inputCollector.close();
    }
}