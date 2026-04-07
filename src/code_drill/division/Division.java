package code_drill.division;

public class Division {
    
    public static int divide(int dividend, int divisor) {

        if (divisor < 1) {
            return 0;
        }
        
        boolean isNegative = false;
        
        if (dividend < 0) {
            isNegative = !isNegative;
            dividend = -dividend;
        }

        if (divisor < 0) {
            isNegative = !isNegative;
            divisor = -divisor;
        }
        
        int quotient = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient = quotient + 1;
        }
        
        if (isNegative) {
            quotient = -quotient;
        }
        
        return quotient;
    }
}