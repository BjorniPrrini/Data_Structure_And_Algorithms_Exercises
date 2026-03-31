package Stacks_Queue.Question_1.LinkedList;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}