package task11.z3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private Date birthdate;

    public Student(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String formatBirthdate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthdate);
    }

    @Override
    public String toString() {
        return "Дата рождения: " + formatBirthdate("dd.MM.yyyy");
    }
}
