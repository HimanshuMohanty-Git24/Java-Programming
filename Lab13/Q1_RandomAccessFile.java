
/*Write a program to illustrate the RandomAccessFile handling. */

import java.io.*;

class Q1_RandomAccessFile {
    public static void main(String args[]) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("Q1.txt", "rw");
        raf.writeBytes("Hello World");
        raf.seek(4);
        System.out.println(raf.readLine());
        raf.close();
    }
}