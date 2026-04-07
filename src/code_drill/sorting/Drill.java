package code_drill.sorting;

public class Drill {
    public static Number[] squareArraySorting(Number[] arr) {

        for (int i = 0; i < arr.length; i++) {
            double val = (double) arr[i]; 
            arr[i] = val * val;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                if ((double) arr[j] > (double) arr[j + 1]) {

                    arr[j] = (double) arr[j] + (double) arr[j + 1];
                    arr[j + 1] = (double) arr[j] - (double) arr[j + 1];
                    arr[j] = (double) arr[j] - (double) arr[j + 1];
                }
            }
        }
        return arr;
    }
}