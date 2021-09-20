package task0adv.journal;

import task0adv.student.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;

/**
 * The class representing the system for working with students
 */
public class Journal {
    public static void getBestStudent(ArrayList<Student> studentsList) {
        Student bestStudent;
        ListIterator<Student> listIterator = studentsList.listIterator();
        bestStudent = studentsList.get(0);
        while (listIterator.hasNext()) {
            if (bestStudent.getAverageScore() < listIterator.next().getAverageScore()) {
                bestStudent = listIterator.previous();
            }
        }
        System.out.println("Student with highest GPA:");
        System.out.println(bestStudent);
    }

    public static void sortByFullName(ArrayList<Student> studentsList) {
        Comparator<Student> scomp = new Student.StudentFullNameComparator();
        studentsList.sort(scomp);
        System.out.println("Sorted by full name:");
        System.out.println(studentsList);
    }

    public static void sortByAge(ArrayList<Student> studentsList) {
        Comparator<Student> scomp = new Student.StudentAgeComparator();
        studentsList.sort(scomp);
        System.out.println("Sorted by age:");
        System.out.println(studentsList);
    }

    public static void sortByAverageScore(ArrayList<Student> studentsList) {
        Comparator<Student> scomp = new Student.StudentAverageScoreComparator();
        studentsList.sort(scomp);
        System.out.println("Sorted by average score:");
        System.out.println(studentsList);
    }

    public static void sortBySpecialOrder(ArrayList<Student> studentsList) {
        Comparator<Student> scomp = new Student.StudentFullNameComparator().thenComparing(new Student.StudentAverageScoreComparator().thenComparing(new Student.StudentAgeComparator()));
        studentsList.sort(scomp);
        System.out.println("Sorted by special order (Full name -> Average Score -> Age):");
        System.out.println(studentsList);
    }
}
