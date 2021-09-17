package task2.document;

import task2.handler.FileHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * This class is used to generate a report on the verification of document numbers
 */
public class Document {
    private static final ArrayList<String> fileList = new ArrayList<>();
    private static final HashSet<String> documentNumbersList = new HashSet<>();
    private static final HashMap<String, String> commentsMap = new HashMap<>();

    private static void getFileList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the absolute path to the file with document numbers: ");
        String inputString = sc.nextLine();

        while (!inputString.equals("0")) {
            fileList.add(inputString);
            inputString = sc.nextLine();
        }
    }

    private static void getDocumentNumbersList() {
        for (String item : fileList) {
            documentNumbersList.addAll(FileHandler.readFile(item));
        }
    }

    private static void getCommentsMap() {
        String validDataMessage = "valid number";
        String invalidLengthMessage = "document number length does not consist of 15 characters";
        String invalidStartMessage = "the document number does not starts with \"docnum\" or \"kontract\"";

        for (String item : documentNumbersList) {
            if (Validator.checkNumber(item)) {
                commentsMap.put(item, validDataMessage);
            } else if (item.length() != 15) {
                commentsMap.put(item, invalidLengthMessage);
            } else {
                commentsMap.put(item, invalidStartMessage);
            }
        }
    }

    public static void getReport() {
        getFileList();
        getDocumentNumbersList();
        getCommentsMap();
        FileHandler.writeFile(commentsMap);
        System.out.println("The report has been successfully generated!");
    }
}
