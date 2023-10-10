package task9.t3;

import java.util.*;

public class MergeSortStudents {
    public static void main(String[] args) {
        // Создаем два списка студентов
        List<Student3> list1 = new ArrayList<>();
        list1.add(new Student3("Алиса", 22));
        list1.add(new Student3("Боб", 20));
        list1.add(new Student3("Чарли", 25));

        List<Student3> list2 = new ArrayList<>();
        list2.add(new Student3("Давид", 19));
        list2.add(new Student3("кто-то", 21));
        list2.add(new Student3("Франк", 23));

        // Вызываем функцию для объединения и сортировки списков
        List<Student3> mergedList = mergeAndSortLists(list1, list2);

        // Выводим результат
        for (Student3 student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student3> mergeAndSortLists(List<Student3> list1, List<Student3> list2) {
        List<Student3> mergedList = new ArrayList<>();

        mergedList.addAll(list1);

        mergedList.addAll(list2);

        Collections.sort(mergedList);

        return mergedList;
    }
}