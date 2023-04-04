package Lab11;

/*Q5.Write a Java program to get the last modification date and time of a file (1 Marks)
 */
import java.io.File;
import java.text.SimpleDateFormat;

public class Q5_FileTime {
    public static void main(String[] args) {
        String filePath = "Text.txt";
        File file = new File(filePath);
        if (file.exists()) {
            long lastModified = file.lastModified();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Last modified date and time: " + dateFormat.format(lastModified));
        } else {
            System.out.println("File does not exist.");
        }
    }
}