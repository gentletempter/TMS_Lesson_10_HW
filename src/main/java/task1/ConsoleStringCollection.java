package task1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is used to replace the "+" character with the string "+++"
 */
public class ConsoleStringCollection {
    public static void getConsoleStringCollection() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> consoleStringList = new ArrayList<>(5);
        String targetChar = "+";
        String replacement = "+++";

        for (int i = 0; i < 5; i++) {
            consoleStringList.add(sc.nextLine().replace(targetChar, replacement));
        }

        System.out.println("Collection-result: " + consoleStringList);
    }
}
