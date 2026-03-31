package Stacks_Queue.Question_2;

public interface Queue<T> {
    void enqueue(T value);
    T dequeue() throws Exception;
    T first() throws Exception;
    int size();
    boolean isEmpty();
}