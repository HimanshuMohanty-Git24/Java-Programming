import java.io.*;
import java.util.*;

public class Qb {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "2105719.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
                FileWriter writer = new FileWriter(destinationFilePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    char[] letters = word.toCharArray();
                    Arrays.sort(letters);
                    letters[0] = Character.toUpperCase(letters[0]);
                    letters[letters.length - 1] = Character.toUpperCase(letters[letters.length - 1]);
                    writer.write(new String(letters) + " ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}