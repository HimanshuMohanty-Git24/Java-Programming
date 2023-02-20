
/*
 * 1. Write a program in Java to define a class Number with appropriate data
 * members and
 * member functions to input n number of integers and swap the biggest and
 * smallest
 * elements. Use member functions read(), swap() and display().
 */
import java.util.Scanner;

class Number {
    int n;
    int a[];

    Number() {
        n = 0;
        a = new int[100];
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
    }

    void swap() {
        int max = a[0], min = a[0], maxpos = 0, minpos = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxpos = i;
            }
            if (a[i] < min) {
                min = a[i];
                minpos = i;
            }
        }
        int temp = a[maxpos];
        a[maxpos] = a[minpos];
        a[minpos] = temp;
    }

    void display() {
        System.out.println("The elements are: ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

class main {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.read();
        obj.swap();
        obj.display();
    }
}