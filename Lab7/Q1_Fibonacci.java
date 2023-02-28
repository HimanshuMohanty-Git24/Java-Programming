/*1.Write a Java program to generate Fibonacci numbers from 1 to 100 using recursion
method. */
package Lab7;

import java.util.Scanner;

class Q1_Fibonacci {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
