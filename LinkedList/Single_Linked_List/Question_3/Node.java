package LinkedList.Single_Linked_List.Question_3;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}