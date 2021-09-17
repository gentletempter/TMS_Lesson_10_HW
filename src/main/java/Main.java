import task0.RandomIntCollection;
import task0adv.journal.Journal;
import task0adv.student.Student;
import task1.ConsoleStringCollection;
import task2.document.Document;
import task3.MyImmutableClass;
import task4.garage.Garage;
import task5.MyCustomCollection;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        printTaskNumber(0);
        RandomIntCollection.getRandomIntCollection();
        printTaskNumber(1);
        ConsoleStringCollection.getConsoleStringCollection();
        printTaskNumber(2);
        Document.getReport();
        printTaskNumber(3);
        MyImmutableClass myClass = MyImmutableClass.createNewInstance("Tony", 30, new Date());
        System.out.println(myClass);
        printTaskNumber(4);
        Garage.getGarageDemo();
        printTaskNumber(5);
        MyCustomCollection.MyCustomCollectionDemo();
        printTaskNumber(00);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Jack", "Black", 25, 8.6F));
        studentsList.add(new Student("Ryan", "Reynolds", 23, 9.1F));
        studentsList.add(new Student("Olivia", "Wilde", 21, 8.1F));
        studentsList.add(new Student("Orlando", "Blum", 20, 9.3F));
        studentsList.add(new Student("Jessica", "Alba", 22, 7.8F));
        Journal.getBestStudent(studentsList);
        Journal.sortByFullName(studentsList);
        Journal.sortByAge(studentsList);
        Journal.sortByAverageScore(studentsList);
        Journal.sortBySpecialOrder(studentsList);
    }

    private static void printTaskNumber(int i) {
        System.out.printf(ANSI_GREEN + "________________________________Task_%d________________________________\n" + ANSI_RESET, i);
    }
}
