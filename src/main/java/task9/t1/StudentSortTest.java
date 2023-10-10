package task9.t1;

import java.util.Arrays;

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(3, "Иван", "Иванов"),
                new Student(1, "Петр", "Петров"),
                new Student(2, "Анна", "Сидорова"),
                new Student(4, "Елена", "Смирнова")
        };

        Arrays.sort(students, (student1, student2) -> Integer.compare(student1.getIDNumber(), student2.getIDNumber()));

        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getFirstName() + ", Фамилия: " + student.getLastName());
        }
    }
}
