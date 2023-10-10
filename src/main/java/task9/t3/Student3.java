package task9.t3;

import lombok.Data;

@Data
class Student3 implements Comparable<Student3> {
    private String name;
    private int age;

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student3 other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
