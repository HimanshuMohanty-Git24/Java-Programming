
// Write a program to describe inheritance in java
import java.util.*;

class A {
    int a;

    void geta() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
    }

    void showa() {
        System.out.println("a = " + a);
    }
}