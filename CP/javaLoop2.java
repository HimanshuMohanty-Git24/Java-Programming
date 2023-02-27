package CP;

import java.util.*;
import java.io.*;

class javaLoop2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int result = 0;
        for (int i = 0; i < t; i++) {
            result = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                result = result + (a + (int) Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
