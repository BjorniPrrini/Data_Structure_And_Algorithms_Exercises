package Stacks_Queue.Question_1.LinkedList;

import java.util.EmptyStackException;

import Stacks_Queue.Question_1.Stack;

public class ImplementStackSingleLinkedList<T> implements Stack<T>{
    private Node<T> head;

    @Override
    public void push(T value){
        Node<T> newNode = new Node<T>(value);

        if(head == null){
            head = newNode;

            return;
        }

        newNode.next = head;
        head = newNode;
    }

    @Override
    public T pop(){
        if(head == null){
            throw new EmptyStackException();
        }

        T data = head.data;

        head = head.next;

        return data;
    }

    @Override
    public T peek(){
        if(head == null){
            System.out.println("Empty list");

            return null;
        }

        T data = head.data;

        return data;
    }

    @Override
    public int size(){
        if(head == null){
            return 0;
        }

        int count = 0;

        Node<T> curr = head;

        while(curr != null){
            count++;

            curr = curr.next;
        }

        return count;
    }

    @Override
    public boolean isEmpty(){
        if(head != null){
            return false;
        }else{
            return true;
        }
    }
}