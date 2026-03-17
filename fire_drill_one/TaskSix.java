package fire_drill_one;

public class TaskSix {
    public static void main(String[] args) {

        System.out.println("A program that prints the 5 multiples of each result from TaskFour.");
        System.out.println("");

        System.out.print("Response: ");

        int i = 0;
        while (i++ < 10) {
            if (i % 4 == 0) {

                int j = 0;
                long multiple = i;
                while (j++ < 5) {
                    System.out.print(multiple);
                    System.out.print(" ");

                    multiple = multiple * i;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Done!");

    }
}