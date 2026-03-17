package fire_drill_one;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that prints each result from TaskFour 5 times.");
        System.out.println("");

        System.out.print("Response: ");

        int i = 0;
        while (i++ < 10) {
            if (i % 4 == 0) {
                int j = 0;
                while (j++ < 5) {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
        }

        System.out.println(" ");
        System.out.println("Done!");

        inputCollector.close();
    }
}