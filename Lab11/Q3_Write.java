package Lab11;

/*Q3-Write Content into a File using FileOutputStream in Java. (2 Marks)
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class Q3_Write {
    public static void main(String[] args) {
        String content = "I am Himanshu Mohanty i am a cse student";

        try {
            File file = new File("Text.txt");
            FileOutputStream fos = new FileOutputStream(file);

            byte[] bytesArray = content.getBytes();

            fos.write(bytesArray);
            fos.close();

            System.out.println("Content has been written to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
