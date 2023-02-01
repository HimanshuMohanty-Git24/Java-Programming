
//Q2.Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name.
import java.util.*;

class NameReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.println(lastName + " " + firstName);
    }
}
