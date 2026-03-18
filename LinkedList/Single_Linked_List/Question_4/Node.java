package LinkedList.Single_Linked_List.Question_4;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}