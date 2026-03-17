package fire_drill_one;

public class TaskNine {
    public static void main(String[] args) {

        System.out.println("A program that prints the square of result from TaskSeven.");
        System.out.println("");

        System.out.print("Response: ");

        long totalSum = 0;
        int i = 0;
        while (i++ < 10) {
            if (i % 4 == 0) {

                int j = 0;
                long multiple = i;
                long sum = 0;
                while (j++ < 5) {
                    //System.out.print(multiple);
                    sum = sum + multiple;
                    multiple = multiple * i;
                    
                }
                totalSum = totalSum + sum;
            }
            
        }

        System.out.print(totalSum * totalSum);
        System.out.println(" ");
        System.out.println("Done!");

    }
}




