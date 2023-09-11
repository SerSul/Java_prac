package task2.ex_1;

public class TestAuthor {
    public static void test_z1() {
        Author author1 = new Author("John Smith", "john.smith@example.com", 'M');
        Author author2 = new Author("Jane Doe", "jane.doe@example.com", 'F');

        System.out.println("Author 1: " + author1);
        System.out.println("Author 2: " + author2);


        author1.setEmail("john.smith.updated@example.com");
        System.out.println("Updated Author 1: " + author1);
    }
}

