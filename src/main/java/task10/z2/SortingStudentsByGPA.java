package task10.z2;

import java.util.*;

class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    public void setArray(List<Student> students) {
        iDNumber = students;
    }

    public void quicksort(Comparator<Student> comparator) {
        Collections.sort(iDNumber, comparator);
    }

    public void sortByOtherField(Comparator<Student> comparator) {
        Collections.sort(iDNumber, comparator);
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 3.5));
        students.add(new Student(5, "Charlie", 4.0));
        students.add(new Student(4, "David", 3.2));

        sorter.setArray(students);

        System.out.println("Original array:");
        sorter.outArray();

        sorter.quicksort(Comparator.comparing(Student::getGpa).reversed());

        System.out.println("\nSorted by GPA (descending):");
        sorter.outArray();

        sorter.sortByOtherField(Comparator.comparing(Student::getIdNumber));

        System.out.println("\nSorted by ID:");
        sorter.outArray();
    }
}