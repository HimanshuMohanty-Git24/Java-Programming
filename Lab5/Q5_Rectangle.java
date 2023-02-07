
/*
 * Q5. Write a program in Java to define a class Rectangle having data member:
 * length, breadth
 * and class Calculate. Calculate class having data member area() and
 * perimeter() to compute
 * the area and perimeter of the rectangle respectively. Also implement the
 * application class
 * DemoRect where an object of the Rectangle class is created with user entered
 * length and
 * breadth.
 */
import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    class Calculate {
        int area(Rectangle r) {
            return r.length * r.breadth;
        }

        int perimeter(Rectangle r) {
            return 2 * (r.length + r.breadth);
        }
    }
}

class DemoRect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int width = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, width);
        Rectangle.Calculate calculate = rectangle.new Calculate();
        System.out.println("Area of rectangle: " + calculate.area(rectangle));
        System.out.println("Perimeter of rectangle: " + calculate.perimeter(rectangle));
    }
}
