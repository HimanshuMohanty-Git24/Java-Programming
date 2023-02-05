
// find the sum of first n integers
import java.util.Scanner;

class SumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter the value of n: "); // prompt
        int n = sc.nextInt(); // read the value of n
        int sum = 0; // initialize sum
        for (int i = 1; i <= n; i++) // loop from 1 to n
            sum += i; // add i to sum
        System.out.println("Sum of first " + n + " integers is " + sum); // display the result
    }
}