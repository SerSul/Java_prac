package prac24.task2;

public class Client {
    private Chair chair;

    public Client(AbstractFactory factory) {
        chair = factory.createChair();
    }

    public void sit() {
        chair.sit();
    }

    public static void main(String[] args) {
        Client client1 = new Client(new VictorianChairFactory());
        client1.sit();

        Client client2 = new Client(new MultifunctionalChairFactory());
        client2.sit();

        Client client3 = new Client(new MagicChairFactory());
        client3.sit();
    }
}