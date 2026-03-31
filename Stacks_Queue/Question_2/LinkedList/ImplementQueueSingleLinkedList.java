package Stacks_Queue.Question_2.LinkedList;

import Stacks_Queue.Question_2.Queue;

public class ImplementQueueSingleLinkedList<T> implements Queue<T>{
    private Node<T> head;
    private Node<T> tail;

    @Override
    public void enqueue(T value){
        Node<T> newNode = new Node<T>(value);

        if(head == null){
            head = tail = newNode;

            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public T dequeue() throws Exception{
        if(head == null){
            throw new Exception("Stack full");
        }

        T data = head.data;

        head = head.next;

        return data;
    }

    @Override
    public T first() throws Exception{
        if(head == null){
            throw new Exception("Empty queue");
        }

        return head.data;
    }

    @Override
    public int size(){
        if(head == null){
            return 0;
        }

        Node<T> curr = head;

        int count = 0;

        while(curr != null){
            count++;

            curr = curr.next;
        }

        return count;
    }

    @Override
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
}