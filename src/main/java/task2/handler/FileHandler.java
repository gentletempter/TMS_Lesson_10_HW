package task2.handler;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * This class is used for reading and writing files using specific logic
 */
public class FileHandler {

    public static HashSet<String> readFile(String path) {
        HashSet<String> documentNumbersList = new HashSet<>();
        File file = new File(path);
        String docNumber;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            docNumber = reader.readLine();
            while (docNumber != null) {
                documentNumbersList.add(docNumber);
                docNumber = reader.readLine();
            }
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        return documentNumbersList;
    }

    public static void writeFile(HashMap<String, String> commentsMap) {

        File reportFile = new File("./src/main/java/task2/report_document_numbers.txt");

        try {
            if (!reportFile.exists()) {
                reportFile.createNewFile();
            }
        } catch (Exception ex) {
            System.out.println("Failed to create file");
        }

        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reportFile))) {
            for (Map.Entry<String, String> item : commentsMap.entrySet()) {
                fileWriter.write(item + "\n");
            }
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
