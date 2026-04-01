package Trees;

public class Node<T> {
    public T data;
    public Node<T> right;
    public Node<T> left;

    public Node(T data){
        this.data = data;
        right = left = null;
    }
}