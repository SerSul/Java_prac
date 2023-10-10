package task10.z3;

import java.util.*;

public class MergeAndSortStudents {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.5));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 4.0));
        list2.add(new Student("David", 3.2));

        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        mergedList.sort(Comparator.comparing(Student::getGpa));

        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
