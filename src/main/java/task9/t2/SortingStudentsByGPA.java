package task9.t2;

import task9.t1.Student;

import java.util.Comparator;
import java.util.*;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", 4.5));
        students.add(new Student("Петров", 3.8));
        students.add(new Student("Сидоров", 4.2));
        students.add(new Student("Козлов", 3.9));

        Collections.sort(students, new SortingStudentsByGPA());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
