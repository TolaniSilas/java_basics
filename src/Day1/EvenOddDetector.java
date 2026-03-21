import java.util.Scanner;

public class EvenOddDetector {

	public static void main(String[] args) {
	
		Scanner inputCollector = new Scanner(System.in);
		
		System.out.println("Even or Odd Number Detector...");
		
		System.out.print("Enter any number: ");
		
		int number = inputCollector.nextInt();
		
		if (number % 2 == 0) {
			System.out.printf("Number %d is an even number.", number);
			}
			
		if (number % 2 != 0) {
			System.out.printf("Number %d is an odd number.", number);
			}
		
        inputCollector.close();
        
		}

        
	}