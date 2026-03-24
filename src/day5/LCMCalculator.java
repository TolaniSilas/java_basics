package day5;
import java.util.Scanner;

public class LCMCalculator {

    public static int calculateLCM(int[] numbers) {
        int lcmResult = 1;
        int factor = 2;
        boolean divided = true;

        while (divided) {
            divided = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % factor == 0) {
                    numbers[i] /= factor;
                    divided = true;
                }
            }

            if (divided) {
                lcmResult = lcmResult * factor;
            } else {
                factor++;

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] > 1) {
                        divided = true;
                        break;
                    }
                }
            }
        }

        return lcmResult;
    }

}