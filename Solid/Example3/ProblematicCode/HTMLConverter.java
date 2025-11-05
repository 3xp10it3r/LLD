package LLD.Solid.Example3.ProblematicCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HTMLConverter {

    public static void main(String[] args) {
        try {
            System.out.println("Please specify the file path to convert to HTML:");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();

            if(fullFilePath == null || fullFilePath.isEmpty()) {
                System.out.println("No file path provided. Exiting.");
                return;
            }

            String inputText = readAllText(fullFilePath);
            String[] paragraphs = inputText.split("(\\r\\n?|\\n)");

            StringBuilder sb = new StringBuilder();

            for (String paragraph : paragraphs) {
                if(paragraph.trim().isEmpty()) continue;

                sb.append("<p>").append(paragraph).append("</p>\n");
            }
            sb.append("<br/>\n");

            writeToFile(fullFilePath, sb.toString());

        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }

        System.out.println("Press any key to exit");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readAllText(String filePath) throws IOException{
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        return content;
    }

    public static void writeToFile(String filePath, String htmlContent) throws IOException {
        String outputFilePath = Paths.get(filePath).getFileName().toString().replaceFirst("[.][^.]+$", "") + ".html";
        System.out.println(outputFilePath);

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(htmlContent);
        }
    }
    
}
