// Write a program to read one byte at a time from a file and copy it into
// another file
// immediately. (Requires creation of a file)
package Lab12;

import java.io.*;

public class Q2_ReadByte {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("read.txt");
            out = new FileOutputStream("write.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}