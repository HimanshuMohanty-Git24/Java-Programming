/*
 * Illustrate the execution of constructors in multi-level inheritance with
 * three Java classes –
 * plate(int length, int width), box(length, width, height), wood box (length,
 * width, height,
 * thick).
 */
package Lab7;

import java.util.Scanner;

class plate {
    int length, width;

    plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate Constructor");
    }
}

class box extends plate {
    int height;

    box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box Constructor");
    }
}

class woodBox extends box {
    int thick;

    woodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("Wood Box Constructor");
    }
}

class Q3_Multilevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the plate: ");
        int l = input.nextInt();
        System.out.print("Enter the width of the plate: ");
        int w = input.nextInt();
        System.out.print("Enter the height of the box: ");
        int h = input.nextInt();
        System.out.print("Enter the thickness of the wood box: ");
        int t = input.nextInt();
        woodBox wb = new woodBox(l, w, h, t);
    }
}
