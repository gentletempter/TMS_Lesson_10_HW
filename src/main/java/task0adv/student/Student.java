package task0adv.student;

import java.util.Comparator;
import java.util.Objects;

/**
 * The class representing the student
 */
public class Student {
    String name;
    String surname;
    int age;
    public float averageScore;

    public Student(String name, String surname, int age, float averageScore) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {
        return age;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public static class StudentFullNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getFullName().compareTo(student2.getFullName());
        }
    }

    public static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            if (student1.getAge() > student2.getAge()) {
                return 1;
            } else if (student1.getAge() < student2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static class StudentAverageScoreComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            if (student1.getAverageScore() > student2.getAverageScore()) {
                return 1;
            } else if (student1.getAverageScore() < student2.getAverageScore()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Float.compare(student.averageScore, averageScore) == 0 && name.equals(student.name) && surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, averageScore);
    }

    @Override
    public String toString() {
        return '{' + name + " " + surname + ", age: " + age + ", average score: " + averageScore + '}';
    }

}
