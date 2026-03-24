import day4.takehome_assessment.enums.*;
import java.util.Scanner;

public class GeoPoliticalZone {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter state : ");

        String state = inputCollector.nextLine();

        System.out.println();

        System.out.printf("The Geo-political Zone of %S is %s",state, PoliticalZones.getGeoPoliticalZone(state));


        inputCollector.close();

    }
}