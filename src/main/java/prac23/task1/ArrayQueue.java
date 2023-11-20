package prac23.task1;

import java.util.Arrays;

class ArrayQueue<T> implements Queue<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    // Предусловие: элемент не равен null
    // Постусловие: элемент добавлен в конец очереди
    @Override
    public void enqueue(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[front];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    // Постусловие: возвращено текущее количество элементов в очереди
    @Override
    public int size() {
        return size;
    }

    // Постусловие: возвращено true, если очередь пуста, иначе false
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена (все элементы удалены)
    @Override
    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
        front = 0;
        rear = -1;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }


    public static void main(String[] args) {

        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("One");
        queue.enqueue("Two");
        queue.enqueue("Three");

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.element());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}