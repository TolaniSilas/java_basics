import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that collects 10 scores and sums only the valid ones.");
        System.out.println("");

        int i = 0;
        int validSum = 0;
        while (i++ < 10) {
            System.out.print("Enter score " + i + ": ");
            int score = inputCollector.nextInt();

            if (score >= 0 && score <= 100) {
                validSum = validSum + score;
            } 
            
            else if (score < 0 || score > 100) {
                System.out.println("Score " + i + " is invalid and will not be part of the computation.");
            }
        }

        System.out.println("");
        System.out.println("Sum of valid scores: " + validSum);
        System.out.println("Done!");

        inputCollector.close();

    }
    
}