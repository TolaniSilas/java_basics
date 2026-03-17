import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter an integer (The number must be 0 or 1): ");
        int number = inputCollector.nextInt();

        if (number == 0) {
            System.out.println("The returned number is 1.");
        }

        if (number == 1) {
            System.out.println("The returned number is 0.");
        }
        
        if (number != 0) {
            System.out.println("Enter an integer (The number must be 0 or 1).");
        }


        inputCollector.close();
    }


}

