package Lab11;

/*Q4-Write a Java program to read text from file from a specified index or skipping byte using FileInputStream (2 Marks) */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

class Q4_Read {
    public static void main(String[] args) {
        try {
            File file = new File("Text.txt");
            FileInputStream fis = new FileInputStream(file);

            long skipBytes = 5;
            fis.skip(skipBytes);

            byte[] bytesArray = new byte[(int) file.length() - 5];
            fis.read(bytesArray);
            fis.close();

            String content = new String(bytesArray, StandardCharsets.UTF_8);
            System.out.println(content);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
