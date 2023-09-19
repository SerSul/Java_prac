package task3.ex_1;

import java.text.DecimalFormat;

class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет :");



        DecimalFormat df = new DecimalFormat("#.00"); // Форматирование зарплаты с двумя знаками после запятой

        for (Employee employee : employees) {
            System.out.printf("%-30s %10s%n", employee.getFullname(), df.format(employee.getSalary()));
        }


    }
}

public class    ex5_3 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иванов Иван Иванович", 4500.50);
        employees[1] = new Employee("Петров Петр Петрович", 3800.75);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 5200.0);

        Report.generateReport(employees);
    }
}

