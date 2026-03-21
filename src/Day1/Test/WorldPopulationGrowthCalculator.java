import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter the world current population: ");
        long population = inputCollector.nextInt();

        System.out.print("Enter the annual world growth rate as a whole number percentage. For instance, 1 for 1%: ");
        int growthRate = inputCollector.nextInt();

        long afterOneYear = population + (population * growthRate / 100);
        long afterTwoYears = afterOneYear + (afterOneYear * growthRate / 100);
        long afterThreeYears = afterTwoYears + (afterTwoYears * growthRate / 100);
        long afterFourYears = afterThreeYears + (afterThreeYears * growthRate / 100);
        long afterFiveYears = afterFourYears + (afterFourYears * growthRate / 100);

        System.out.println("Estimated world population:");
        System.out.println("After a year: " + afterOneYear);
        System.out.println("After two years: " + afterTwoYears);
        System.out.println("After three years: " + afterThreeYears);
        System.out.println("After four years: " + afterFourYears);
        System.out.println("After five years: " + afterFiveYears);

        inputCollector.close();
    }
}