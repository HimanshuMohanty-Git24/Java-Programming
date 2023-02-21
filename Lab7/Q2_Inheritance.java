/*
 * 2. Write a program in java to define a class Shape which has data member
 * “area” and a
 * member function showArea(). Derive two classes Circle and Rectangle from
 * Shape class. Add
 * appropriate data members and member functions to calculate and display the
 * area of Circle
 * and Rectangle. [Use abstract class].
 */
package Lab7;

import java.util.Scanner;

abstract class Shape {
    double area;

    void showArea() {
    };
}

class Circle extends Shape {
    double radius;
    float Carea;

    Circle(double rad) {
        radius = rad;
    }

    void showArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void showArea() {
        area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Q2_Inheritace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double rad = input.nextDouble();
        Circle c = new Circle(rad);
        c.showArea();
        System.out.print("Enter the length of the rectangle: ");
        double l = input.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double b = input.nextDouble();
        Rectangle r = new Rectangle(l, b);
        r.showArea();
    }

}
