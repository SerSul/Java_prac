package task10.z2;

import lombok.Data;

@Data
class Student {
    private String name;
    private double gpa;
    private int idNumber;

    public Student(int idNumber, String name, double gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student{idNumber=" + idNumber + ", name='" + name + "', gpa=" + gpa + '}';
    }
}
