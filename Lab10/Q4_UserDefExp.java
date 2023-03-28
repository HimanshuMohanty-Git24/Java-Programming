package Lab10;

import java.util.*;

class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

class AgeOutOfBoundException extends Exception {
    public AgeOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    private int age;
    private int marks;

    public Student(int age, int marks) throws AgeOutOfBoundException, MarksOutOfBoundException {
        if (age < 0 || age > 100) {
            throw new AgeOutOfBoundException("Age is out of bounds");
        }
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundException("Marks are out of bounds");
        }
        this.age = age;
        this.marks = marks;
    }
}

public class Q4_UserDefExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age and marks: ");
        int age = sc.nextInt();
        int marks = sc.nextInt();
        try {
            Student s = new Student(age, marks);
        } catch (AgeOutOfBoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (MarksOutOfBoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
