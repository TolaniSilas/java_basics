
public class SlidingWindow {
    public static Number [] findMaxNumbersInSubArray(Number [] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new Number[0];
        }

        Number [] result = new Number [arr.length - k + 1];
        int maxIndex = 0;
        for (int i = 0; i < arr.length - k + 1; i++) {
            if (maxIndex < i) {
                maxIndex = i;
                for (int j = i + 1; j < i + k; j++) {
                    if (arr[j].doubleValue() > arr[maxIndex].doubleValue()) {
                        maxIndex = j;
                    }
                }
            } else if (arr[i + k - 1].doubleValue() > arr[maxIndex].doubleValue()) {
                maxIndex = i + k - 1;
            }
            result[i] = arr[maxIndex];
        }
        return result;





    }
}