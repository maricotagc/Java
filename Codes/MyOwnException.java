package mari.moita.com.Exercise8.Utils;

import java.util.Scanner;

class MyException extends Throwable{

    public MyException(String s) {}

    public static Exception OrNegative() throws Exception {
        throw new Exception("n or p should not be negative.");
    }

    public static Exception AndZero() throws Exception {
        throw new Exception("n and p should not be zero.");
    }
}

class MyCalculator {

    public long power(int base, int exponent) throws Exception {
        long result = 1;
        if (base < 0 || exponent < 0) {
            throw MyException.OrNegative();
        }
        if (base == 0 && exponent == 0) {
            throw MyException.AndZero();
        }
        for (; exponent != 0; --exponent) {
            result *= base;
        }
        return result;
    }
}

public class Solution {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
