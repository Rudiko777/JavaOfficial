package src.lab23.number2;

public interface Queue<T> {
    // Добавить элемент в конец очереди
    void enqueue(T element);

    // Извлечь и вернуть элемент из начала очереди
    T dequeue();

    // Получить элемент из начала очереди, не удаляя его
    T peek();

    // Проверить, пуста ли очередь
    boolean isEmpty();

    // Получить текущий размер очереди
    int size();

    // Очистить очередь (удалить все элементы)
    void clear();
}
