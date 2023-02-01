
// Write a program to check if the given number is Armstrong number or not.
// Armstrong number is a number that is equal to the sum of cubes of its digits.
// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
import java.util.*;

class Armstrongnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
