package Stacks_Queue.Question_10;

import java.util.EmptyStackException;

public class DropoutStackADT<T> {
    T[] arr;
    int capacity;
    int start;
    int size;

    DropoutStackADT(int capacity){
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
        start = 0;
        size = 0;
    }

    public void push(T value){
        if(size == capacity){
            start = (start + 1) % capacity;

            size--;
        }

        int topValue = (start + size) % capacity;

        arr[topValue] = value;

        size++;
    }

    public T pop(){
        if(size == 0){
            throw new EmptyStackException();
        }

        int topValue = (start + size - 1) % capacity;

        T value = arr[topValue];

        size--;

        return value;
    }

    public T peek(){
        if(size == 0){
            throw new EmptyStackException();
        }

        int topValue = (start + size - 1) % capacity;

        return arr[topValue];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}