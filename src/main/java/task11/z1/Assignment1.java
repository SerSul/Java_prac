package task11.z1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Assignment1 {
    public static void main(String[] args) {
        String developerName = "Dima";
        Date assignmentDate = new Date();
        Date submissionDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Имя разработчика: " + developerName);
        System.out.println("Дата получения задания: " + dateFormat.format(assignmentDate));
        System.out.println("Дата сдачи задания: " + dateFormat.format(submissionDate));
    }
}

