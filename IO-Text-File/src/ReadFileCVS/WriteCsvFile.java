package ReadFileCVS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteCsvFile {
    public static void writeCsvFile(List<Country> array) {
        // Delimiter used in CSV file
        final String COMMA_DELIMITER = ",";
        final String NEW_LINE_SEPARATOR = "\n";

        // CSV file header
        final String FILE_HEADER = "id,code,country";

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("src/ReadFileCVS/file.csv");
            bw = new BufferedWriter(fw);

            // Write the CSV file header
            bw.append(FILE_HEADER);

            // Add a new line separator after the header
            bw.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (Country value : array) {
                bw.append(String.valueOf(value.getId()));
                bw.append(COMMA_DELIMITER);
                bw.append(value.getCode());
                bw.append(COMMA_DELIMITER);
                bw.append(value.getCountry());
                bw.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }

    }
}
