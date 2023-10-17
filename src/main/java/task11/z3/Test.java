package task11.z3;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Date birthdate = new Date();
        Student student = new Student(birthdate);

        String shortFormat = student.formatBirthdate("dd.MM.yyyy");
        System.out.println("Короткий формат даты: " + shortFormat);

        String mediumFormat = student.formatBirthdate("dd MMMM yyyy");
        System.out.println("Средний формат даты: " + mediumFormat);

        String fullFormat = student.formatBirthdate("dd.MM.yyyy HH:mm:ss");
        System.out.println("Полный формат даты: " + fullFormat);

        System.out.println(student.toString());
    }
}
