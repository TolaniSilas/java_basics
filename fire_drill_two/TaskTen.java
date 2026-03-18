import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 scores and prints the average of valid ones.");
        System.out.println("");

        int i = 0;
        int validSum = 0;
        int validCount = 0;
        while (i++ < 10) {
            System.out.print("Enter score " + i + ": ");
            int score = inputCollector.nextInt();

            if (score >= 0 && score <= 100) {
                validSum = validSum + score;
                validCount = validCount + 1;
            } 
            
            else if (score < 0 || score > 100) {
                System.out.println("Score " + i + " is invalid and will not be part of the computation.");
            }
        }

        System.out.println("");
        if (validCount > 0) {
            int average = (int) validSum / validCount;
            System.out.println("Sum of valid scores: " + validSum);
            System.out.println("Average of valid scores: " + average);
        } 
        
        else if (validCount == 0) {
            System.out.println("No valid scores were entered.");
        }

        System.out.println("Done!");

        inputCollector.close();

    }

}