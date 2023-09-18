package task4_1;


public class z3 {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Дзержинский", 30);


        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}

 class Person {
    private String fullName;
    private int age;


    public Person() {
        this.fullName = "Unknown";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    public void move() {
        System.out.println(fullName + " двигается.");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит.");
    }


}
