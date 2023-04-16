package Lab12;

import java.util.*;
import java.io.*;
import java.lang.*;

class MarkOutOfBoundException extends Exception {
    public MarkOutOfBoundException(String message) {
        super(message);
    }
}

class newfile {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Mark:");
            int Mark = input.nextInt();
            if (Mark > 100 || Mark < 0) {
                throw new MarkOutOfBoundException("Wrong Mark Inputted");
            }
        } catch (MarkOutOfBoundException e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }
}
