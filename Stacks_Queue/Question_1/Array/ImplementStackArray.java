package Stacks_Queue.Question_1.Array;

import java.util.EmptyStackException;

import Stacks_Queue.Question_1.Stack;

public class ImplementStackArray<T> implements Stack<T>{
    T[] arr;
    int top;

    @SuppressWarnings("unchecked")
    ImplementStackArray(){
        arr = (T[]) new Object[10];
        top = 0;
    }

    @SuppressWarnings("unchecked")
    ImplementStackArray(int n){
        arr = (T[]) new Object[n];
        top = 0;
    }

    @Override
    public void push(T value){
        if(top >= arr.length){
            throw new StackOverflowError();
        }

        arr[top++] = value;
    }

    @Override
    public T pop(){
        if(top == 0){
            throw new EmptyStackException();
        }

        T data = arr[top];

        top--;

        return data;
    }

    @Override
    public T peek(){
        if(top == 0){
            throw new EmptyStackException();
        }

        return arr[top - 1];
    }

    @Override
    public int size(){
        return top;
    }

    @Override
    public boolean isEmpty(){
        if(top == 0){
            return true;
        }else{
            return false;
        }
    }
}