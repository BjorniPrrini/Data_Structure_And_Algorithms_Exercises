package Stacks_Queue.Question_4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> implements Iterable<E> {
    private E[] data;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity){
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.top = -1;
    }

    public void push(E element){
        if(isFull()){
            throw new IllegalStateException("Stack is full");
        }

        data[++top] = element;
    }

    public E pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        E value = data[top];
        
        data[top] = null;
        
        top--;
        
        return value;
    }

    public E peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        
        return data[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public int size(){
        return top + 1;
    }

    @Override
    public Iterator<E> iterator(){
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E>{
        private int current = top;

        @Override
        public boolean hasNext(){
            return current >= 0;
        }

        @Override
        public E next(){
            if(!hasNext()){
                throw new NoSuchElementException();
            }

            return data[current--];
        }
    }
}