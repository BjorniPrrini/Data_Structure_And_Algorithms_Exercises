package LinkedList.Circular_Linked_List.Question_1;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}