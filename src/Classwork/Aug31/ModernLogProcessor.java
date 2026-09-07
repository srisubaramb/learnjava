package Classwork.Aug31;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
public class ModernLogProcessor {
    public static void main(String[] args) {
        Path inputFile = Paths.get("src/transaction.txt");
        Path outputFile = Paths.get("src/failed_orders.txt");
        try(BufferedReader reader = Files.newBufferedReader(inputFile);
            BufferedWriter writer = Files.newBufferedWriter(outputFile);
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains("FAILED")) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Processed files");
        } catch (IOException e) {
            System.out.println("Error in processing files "  + e.getMessage());
        }
    }
}
