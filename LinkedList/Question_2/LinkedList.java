package LinkedList.Question_2;

public class LinkedList<T> {
    Node<T> head;

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.head = new Node<Integer>(1);
        list.head.next = new Node<Integer>(2);
        list.head.next.next = new Node<Integer>(3);
        list.head.next.next.next = new Node<Integer>(4);
        list.head.next.next.next.next = new Node<Integer>(5);

        printList(list.head);

        System.out.println();

        printListRecursively(list.head);

        System.out.println();

        printListInReverse(list.head);

        System.out.println();

        addNodeToTheEnd(list.head, 6);

        printList(list.head);
    }

    private static <T> void printList(Node<T> head){
        Node<T> curr = head;

        if(head == null){
            System.out.println("No nodes in the list.");

            return;
        }

        while(curr != null){
            System.out.print(curr.data + " -> ");

            curr = curr.next;
        }

        System.out.println("null");
    }

    private static <T> void printListRecursively(Node<T> head){
        if(head == null){
            System.out.println("null");

            return;
        }

        System.out.print(head.data + " -> ");

        printListRecursively(head.next);
    }

    private static <T> void printListInReverse(Node<T> head){
        if(head == null){
            return;
        }

        printListInReverse(head.next);

        System.out.print(head.data + " -> ");
    }

    private static <T> void addNodeToTheEnd(Node<T> head, T value){
        if(head == null){
            System.out.println("No nodes in the list.");

            return;
        }

        Node<T> newNode = new Node<>(value);

        Node<T> curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }
}