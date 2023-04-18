import java.io.*;

public class Q2_Tokenizer {

    public static void main(String[] args) {

        String rollNumber = "2105719";

        String inputFileName = "Q2.txt";

        String outputFileName = rollNumber + ".txt";

        try {

            FileReader inputFileReader = new FileReader(inputFileName);

            BufferedReader bufferedReader = new BufferedReader(inputFileReader);

            FileWriter outputFileWriter = new FileWriter(outputFileName);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] tokens = line.split("\\s+");

                for (int i = 0; i < tokens.length; i++) {

                    String token = tokens[i];

                    char firstChar = token.charAt(0);
                    char lastChar = token.charAt(token.length() - 1);

                    String modifiedToken = token;

                    if (token.length() > 1) {
                        modifiedToken = lastChar + token.substring(1, token.length() - 1) + firstChar;
                    }

                    outputFileWriter.write(modifiedToken);

                    if (i < tokens.length - 1) {
                        outputFileWriter.write(",");
                    }
                }

                outputFileWriter.write("\n");
            }

            bufferedReader.close();
            inputFileReader.close();
            outputFileWriter.close();

            System.out.println("Successfully wrote to file " + outputFileName);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
