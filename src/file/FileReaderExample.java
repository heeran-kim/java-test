package file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "input.txt";
        StringBuilder content = new StringBuilder();

        // it's good practice to use exception handling for I/O operations
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            System.out.println("File content: ");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            // In error situation, we also assign default content for the reading result
            content.append("Default content: The file was not found, so this is the default content.");
        }

        // Print or use the content reade, or default if file doesn't exist
        System.out.println("Final content: ");
        System.out.println(content.toString());
    }
}
