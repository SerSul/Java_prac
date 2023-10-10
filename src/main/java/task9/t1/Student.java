package task9.t1;

import lombok.Data;

@Data
public class Student {
    private int iDNumber;
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(int iDNumber, String firstName, String lastName) {
        this.iDNumber = iDNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Student(String name, double GPA) {
        this.firstName = name;
        this.GPA = GPA;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + firstName + '\'' +
                ", GPA=" + GPA +
                '}';
    }

}
