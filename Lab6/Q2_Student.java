
/*
 * 2. Write a program in java to input and display the details of n number of
 * students having
 * roll, name and cgpa as data members. Also display the name of the student
 * having lowest
 * cgpa.
 */
import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    Student() {
        roll = 0;
        name = "";
        cgpa = 0;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the roll number: ");
        roll = sc.nextInt();
        System.out.print("Enter the name: ");
        name = sc.next();
        System.out.print("Enter the cgpa: ");
        cgpa = sc.nextFloat();
    }

    void display() {
        System.out.println("The details are: ");
        System.out.println("Roll number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class Q2_Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read();
        }
        float min = s[0].cgpa;
        int minpos = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].cgpa < min) {
                min = s[i].cgpa;
                minpos = i;
            }
        }
        System.out.println("The student with lowest cgpa is: ");
        s[minpos].display();
    }
}