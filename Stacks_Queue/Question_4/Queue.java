package Stacks_Queue.Question_4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements Iterable<E> {
    private E[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Queue(int capacity){
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(E element){
        if(isFull()){
            throw new IllegalStateException("Queue is full");
        }

        rear = (rear + 1) % capacity;
        
        data[rear] = element;
        
        size++;
    }

    public E dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }

        E value = data[front];

        data[front] = null;

        front = (front + 1) % capacity;

        size--;

        return value;
    }

    public E peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }

        return data[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<E> iterator(){
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<E>{
        private int count = 0;
        private int currentIndex = front;

        @Override
        public boolean hasNext(){
            return count < size;
        }

        @Override
        public E next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }

            E value = data[currentIndex];

            currentIndex = (currentIndex + 1) % capacity;
            
            count++;
            
            return value;
        }
    }
}