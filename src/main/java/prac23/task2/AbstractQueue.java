package prac23.task2;

// Базовый класс для реализации очередей
abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
