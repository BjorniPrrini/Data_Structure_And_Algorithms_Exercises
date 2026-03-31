package Stacks_Queue.Question_2.Array;

import Stacks_Queue.Question_2.Queue;

public class ImplementQueueArray<T> implements Queue<T>{
    T[] arr;
    int top;
    int bottom;

    @SuppressWarnings("unchecked")
    ImplementQueueArray(){
        arr = (T[]) new Object[10];
        top = 0;
        bottom = 0;
    }

    @SuppressWarnings("unchecked")
    ImplementQueueArray(int n){
        arr = (T[]) new Object[n];
        top = 0;
        bottom = 0;
    }

    @Override
    public void enqueue(T value){
        if(top >= arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        arr[top++] = value;
    }

    @Override
    public T dequeue() throws Exception{
        if(top == bottom){
            throw new Exception("Stack empty");
        }

        return arr[bottom++];
    }

    @Override
    public T first(){
        return arr[bottom];
    }

    @Override
    public int size(){
        return top - bottom;
    }

    @Override
    public boolean isEmpty(){
        if(top == bottom){
            return true;
        }else{
            return false;
        }
    }
}