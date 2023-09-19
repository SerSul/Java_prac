package task4_1;

public class z2
{
    public static void main(String[] args) {
        // Создаем три экземпляра класса Phone
        Phone phone1 = new Phone("123-456-789", "iPhone 12", 162.3);
        Phone phone2 = new Phone("987-654-321", "Samsung Galaxy S21");
        Phone phone3 = new Phone();

        // Выводим информацию о каждом телефоне
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        // Принимаем звонок
        phone1.receiveCall("John");
        phone2.receiveCall("Alice", "555-555-555");

        // Отправляем сообщение
        phone1.sendMessage("111-111-111", "222-222-222");
    }
}


class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model) {
        this(number, model, 0.0);
    }


    public Phone() {
        this("", "");
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }


    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (Номер: " + callerNumber + ")");
    }


    public void sendMessage(String... numbers) {
        System.out.print(" сообщение на номера: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public void printInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Номер: " + number);
        System.out.println("Вес: " + weight + " г");
    }


}

