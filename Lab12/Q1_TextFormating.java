// Write a program that takes an input from a text file and replace a ‘#’by a
// ‘*’ and replace
// every new line with’/’ and store the output to another file.
package Lab12;

import java.io.*;
import java.util.Scanner;

public class Q1_TextFormating {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the name of the input file: ");
        // String inputFileName = sc.nextLine();
        // System.out.print("Enter the name of the output file: ");
        // String outputFileName = sc.nextLine();
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        if (!inputFile.exists()) {
            System.out.println("Input file does not exist");
            System.exit(1);
        }
        if (!outputFile.exists()) {
            System.out.println("Output file does not exist");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(inputFile);
                PrintWriter output = new PrintWriter(outputFile);) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replace('#', '*');
                String s3 = s2.replace('\r', '/');
                output.println(s3);
            }
        }
    }
}