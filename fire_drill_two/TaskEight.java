import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 valid scores between 0 and 100 and prints the sum.");
        System.out.println("");

        int i = 0;
        int sum = 0;
        while (i < 10) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int score = inputCollector.nextInt();

            if (score >= 0 && score <= 100) {
                sum = sum + score;
                i = i + 1;
            } 
            
            else if (score < 0 || score > 100) {
                System.out.println("Invalid score entered. Please enter a value between 0 and 100.");
            }
        }

        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Done!");

        inputCollector.close();
    }
}