/*3. Write a program in which a super class ‘Course’ is defined with the following details:
Data members: (i) credit (int variable) (ii) medium
Method: (i) number() to calculate the total number of students registered for the
course. If the number is exceeding the minimum number defined (let say 2 students), the
course will be floated otherwise not.
(ii) display() that shows whether the course is floated.
Derived the subclass for two courses, namely courseA and courseB that would show the
total number of students registered for these courses and the course details. */
package Lab8;

import java.util.Scanner;

class Course {
    int credit;
    String medium;

    Course() {
        credit = 0;
        medium = "NULL";
    }

    Course(int c, String m) {
        credit = c;
        medium = m;
    }

    void number() {
    }

    void display() {
    }
}

class CourseA extends Course {
    int StudNumA = 0;

    CourseA(int c, String m) {
        super(c, m);
    }

    void display() {
        System.out.println("Total Registred Student:" + StudNumA);
        System.out.println("Credit of Course:" + credit);
        System.out.println("Medium of Course:" + medium);
    }
}

class CourseB extends Course {
    int StudNumB = 0;

    CourseB(int c, String m) {
        super(c, m);
    }

    void display() {
        System.out.println("Total Registred Student:" + StudNumB);
        System.out.println("Credit of Course:" + credit);
        System.out.println("Medium of Course:" + medium);
    }
}

class Q3_Course {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student Enrolled for Course A:");
        CourseA a = new CourseA(3, "ENG");
        a.StudNumA = input.nextInt();
        System.out.println("Enter the number of student Enrolled for Course B:");
        CourseB b = new CourseB(4, "ENG");
        b.StudNumB = input.nextInt();
        if (a.StudNumA >= 2) {
            System.out.println("Course A is floated");
            a.display();

        } else if (b.StudNumB >= 2) {
            System.out.println("Course B is floated");
            b.display();
        }
    }
}