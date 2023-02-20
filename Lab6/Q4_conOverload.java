
/*
 * 4. Write a java program to implement method overloading and constructors
 * overloading.
 */
import java.util.Scanner;

class Overload {
    int a, b;

    Overload() {
        a = 0;
        b = 0;
    }

    Overload(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Sum = " + (a + b));
    }

    void add(int x) {
        System.out.println("Sum = " + (a + b + x));
    }

    void add(int x, int y) {
        System.out.println("Sum = " + (a + b + x + y));
    }
}

class Q4_conOverload {
    public static void main(String[] args) {
        Overload obj1 = new Overload();
        Overload obj2 = new Overload(1, 2);
        obj1.add();
        obj2.add();
        obj2.add(5);
        obj2.add(5, 6);
    }
}