package prac24.task2;

public class VictorianChairFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
