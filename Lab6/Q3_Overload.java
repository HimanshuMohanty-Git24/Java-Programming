/*
 * 3. Write a program which will overload the area () method and display the
 * area of a circle,
 * triangle and square as per user choice and user entered dimensions.
 */

import java.util.Scanner;

class Area {
    void area(Double r) {
        System.out.println("The area of the circle is: " + (3.14 * r * r));
    }

    void area(int b, int h) {
        System.out.println("The area of the triangle is: " + (0.5 * b * h));
    }

    void area(int side) {
        System.out.println("The area of the square is: " + (side * side));
    }
}

class Q3_Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        System.out.println("Enter the choice: ");
        System.out.println("1. Area of a circle");
        System.out.println("2. Area of a triangle");
        System.out.println("3. Area of a square");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter the radius: ");
                Double r = sc.nextDouble();
                obj.area(r);
                break;
            case 2:
                System.out.print("Enter the base: ");
                int b = sc.nextInt();
                System.out.print("Enter the height: ");
                int h = sc.nextInt();
                obj.area(b, h);
                break;
            case 3:
                System.out.print("Enter the side: ");
                int side = sc.nextInt();
                obj.area(side);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}