
/*
 * 4. Write a class file – box with three data members (length, width, height)
 * and a method
 * volume() . Also implement the application class Demo where an object of the
 * box class is
 * created with user entered dimensions and volume is printed.
 */
import java.util.Scanner;

class Box {
    double length, width, height;

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        Box b = new Box(length, width, height);
        System.out.println("Volume of the box: " + b.volume());
    }
}