
//Q5.Write a program to convert a binary numbers to decimal number and vice-versa.
import java.util.*;

class BintoDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binaryString = Integer.toBinaryString(decimal);
        System.out.println("Binary: " + binaryString);
    }
}
