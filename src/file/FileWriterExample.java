package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Hello, world!\nThis is a test of FileWriter.";

        try (FileWriter writer = new FileWriter(filePath)){
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
