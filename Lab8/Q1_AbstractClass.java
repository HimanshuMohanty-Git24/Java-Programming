/*1. Illustrate the usage of abstract class with following Java classes –

i&gt;An abstract class “Student‟ with data member roll no, reg no and
a abstract method course()
ii&gt;A subclass “Kiitian” with course() method implementation */
package Lab8;

abstract class Student {
    int rollNo;
    int regNo;

    public Student(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    public abstract void course();
}

class Kiitian extends Student {

    public Kiitian(int rollNo, int regNo) {
        super(rollNo, regNo);
    }

    public void course() {
        System.out.println("I am studying Computer Science.");
    }
}

class Q1_AbstractClass {
    public static void main(String[] args) {
        Kiitian k = new Kiitian(1, 2);
        k.course();
    }
}
