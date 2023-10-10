package task9;

import lombok.Getter;

@Getter
public class Student4 implements Comparable<Student4> {
    private String name;
    private int age;

    public Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student4 other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student4 student1 = new Student4("Alice", 22);
        Student4 student2 = new Student4("Bob", 20);
        Student4 student3 = new Student4("Charlie", 25);

        int result1 = student1.compareTo(student2);
        int result2 = student2.compareTo(student3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
