package fire_drill_one;

public class TaskSeven {
    public static void main(String[] args) {

        System.out.println("A program that prints the 5 multiples of each result from TaskFour.");
        System.out.println("");

        System.out.print("Response: ");

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
                System.out.print(sum);
                System.out.print(" ");
            }
        }

        System.out.println(" ");
        System.out.println("Done!");

    }
}

