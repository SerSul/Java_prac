package task10.z1;

import lombok.Data;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;

    public Student(String firstName, String lastName, String specialty, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "Информатика", 2, "Группа A");
        System.out.println(student);
    }
}
