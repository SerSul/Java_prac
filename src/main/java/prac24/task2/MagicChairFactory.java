package prac24.task2;

public class MagicChairFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
