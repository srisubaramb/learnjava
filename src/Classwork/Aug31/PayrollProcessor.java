package Classwork.Aug31;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PayrollProcessor {
    public static void main(String[] args) {
        Path file = Paths.get("src/employees.csv");
        try(BufferedReader reader = Files.newBufferedReader(file);){
            boolean header = true;
            String lines;
            while ((lines = reader.readLine()) != null) {
                if(header) {
                    header = false;
                    continue;
                }
                String[] data = lines.split(",");
                String id = data[0];
                String name = data[1];
                String dept = data[2];
                double baseSalary = Double.parseDouble(data[3]);

                double totalPayout = baseSalary * 1.10;
                System.out.printf("Processed -> ID : %s | Name : %-10s | Dept : %-11s | Total Payout : Rs%.2f\n"
                , id , name , dept, totalPayout);
            }
        }catch (IOException e){
            System.out.println("Error while reading file " + e.getMessage());
        }
    }
}
