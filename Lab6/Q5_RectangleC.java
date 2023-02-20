
/*
 * 5. Write a java program to compute the area of a rectangle using Java Inner
 * class as
 */
import java.util.Scanner;

class Rect {
    int Length;
    int Width;

    Rect() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        Length = sc.nextInt();
        System.out.print("Enter Width: ");
        Width = sc.nextInt();
    }

    class RectArea {

        int Area(Rect r) {
            return r.Length * r.Width;
        }
    }

}

class Demomain {
    public static void main(String[] args) {
        Rect r = new Rect();
        Rect.RectArea Area = r.new RectArea();
        System.out.println("Area of rectangle: " + Area.Area(r));
    }
}