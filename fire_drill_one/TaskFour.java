package fire_drill_one;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        System.out.println("A program that prints multiples of 4 between 1 to 10 using loop.");
        System.out.println(""); 
        
        System.out.print("Response: " );
        
        int i = 0;
        while (i++ < 10) {
        
        if (i % 4 == 0) {
        System.out.print(i);
        System.out.print(" ");     
        }
   
        }
        
        System.out.println(" ");
       
        System.out.println("Done!");
        
        inputCollector.close();
    
    }

}