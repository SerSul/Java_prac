package prac23.task2;

// Реализация очереди на связанном списке
class LinkedQueue<T> extends AbstractQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    // Предусловие: элемент не равен null
    // Постусловие: элемент добавлен в конец очереди
    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return element;
    }

    public static void main(String[] args) {
        // Пример использования
        LinkedQueue<String> queue = new LinkedQueue<>();
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
