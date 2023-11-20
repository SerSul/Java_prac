package prac24.task2;

public class MultifunctionalChairFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
