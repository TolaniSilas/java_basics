import java.util.Scanner;

public class PyramidWeightEstimator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter estimated number of stones used: ");
        int numberOfStones = inputCollector.nextInt();

        System.out.print("Enter average weight of each stone (in pounds): ");
        int stoneWeightPounds = inputCollector.nextInt();

        System.out.print("Enter number of years taken to build the pyramid: ");
        int years = inputCollector.nextInt();

        int totalWeight = numberOfStones * stoneWeightPounds;

        int days = years * 365;
        int hours = days * 24;
        int minutes = hours * 60;

        int weightPerYear = totalWeight / years;
        int weightPerDay = totalWeight / days;
        int weightPerHour = totalWeight / hours;
        int weightPerMinute = totalWeight / minutes;

        System.out.println("Total pyramid weight (pounds): " + totalWeight);
        System.out.println("Weight built per year: " + weightPerYear);
        System.out.println("Weight built per day: " + weightPerDay);
        System.out.println("Weight built per hour: " + weightPerHour);
        System.out.println("Weight built per minute: " + weightPerMinute);

        inputCollector.close();
    }
}