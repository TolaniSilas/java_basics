package day4;
// import java.util.Scanner;


public class CurrencyConverterIntoWords {

    static String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    static String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    static String hundredsToWords(int n) {
        if (n == 0) return "";

        String result = "";

        if (n >= 100) {
            result += ones[n / 100] + " hundred ";
            n = n % 100;
        }

        if (n >= 20) {
            result += tens[n / 10] + " ";
            n = n % 10;
        }

        if (n > 0) {
            result += ones[n] + " ";
        }

        return result;
    }

    static String numberToWords(long n) {
        if (n == 0) return "zero";

        String result = "";

        if (n >= 1000000000) {
            result += hundredsToWords((int)(n / 1000000000)) + "billion ";
            n = n % 1000000000;
        }

        if (n >= 1000000) {
            result += hundredsToWords((int)(n / 1000000)) + "million ";
            n = n % 1000000;
        }

        if (n >= 1000) {
            result += hundredsToWords((int)(n / 1000)) + "thousand ";
            n = n % 1000;
        }

        if (n > 0) {
            result += hundredsToWords((int) n);
        }

        return result.trim();
    }


    public static void main(String[] args) {
        System.out.println(numberToWords(0));
        System.out.println(numberToWords(1));
        System.out.println(numberToWords(500));
        System.out.println(numberToWords(683));
        System.out.println(numberToWords(100));
        System.out.println(numberToWords(1090));
        System.out.println(numberToWords(124650));
        System.out.println(numberToWords(1005900));
        System.out.println(numberToWords(123432694));
    }
}
