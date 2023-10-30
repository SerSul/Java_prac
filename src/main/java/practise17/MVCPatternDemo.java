package practise17;


public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        view.addUpdateListener(e -> {
            String rollNo = view.getRollNo();
            String name = view.getName();

            controller.setStudentRollNo(rollNo);
            controller.setStudentName(name);

            controller.updateView();
        });
    }

    private static Student retrieveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Dima");
        student.setRollNo("28");
        return student;
    }
}
