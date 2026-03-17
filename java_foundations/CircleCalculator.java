import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = inputCollector.nextInt();

        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %f%n", 2 * Math.PI * radius);
        System.out.printf("Area: %f%n", Math.PI * radius * radius);

        inputCollector.close();
    }


}