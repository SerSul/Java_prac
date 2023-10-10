package task10.z3;

import lombok.Data;

@Data
class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + '}';
    }
}
