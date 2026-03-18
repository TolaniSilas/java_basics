import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int largestNumber = inputCollector.nextInt();
        
        int i = 1;
        while (i++ <5) {
        
        System.out.print("Enter Number "+ i + ": ");
        
        int userInput = inputCollector.nextInt();
        
        if (userInput > largestNumber) {
        largestNumber = userInput;
        
        }
           
        } 
        System.out.printf("Largest number is %d%n", largestNumber);
        


        inputCollector.close();
    }


}

