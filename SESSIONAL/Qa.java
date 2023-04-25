
import java.util.*;
import java.io.*;

class Mycalculator {

    long Power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new ArithmeticException("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new ArithmeticException("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

class Qa {
    public static void main(String[] args) {
        Mycalculator my_calculator = new Mycalculator();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            try {
                System.out.println(my_calculator.Power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
