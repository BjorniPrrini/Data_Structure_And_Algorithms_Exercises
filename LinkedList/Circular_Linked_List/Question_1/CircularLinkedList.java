package LinkedList.Circular_Linked_List.Question_1;

public class CircularLinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public void add(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;

            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            
            return;
        }

        Node<T> curr = head;

        do{
            System.out.print(curr.data + " -> ");

            curr = curr.next;
        }while(curr != head);

        System.out.println("(back to head)");
    }

    public int size(){
        if(head == null){
            return 0;
        }

        Node<T> curr = head;
        int count = 0;

        do{
            count++;

            curr = curr.next;
        }while(curr != head);

        return count;
    }

    public int search(T value){
        if(head == null){
            return -1;
        }

        Node<T> curr = head;
        int index = 0;

        do{
            if(curr.data.equals(value)){
                return index;
            }

            index++;

            curr = curr.next;
        }while(curr != head);

        return -1;
    }

    public void delete(T value){
        if(head == null){
            return;
        }

        if(head == tail && head.data.equals(value)){
            head = null;
            tail = null;

            return;
        }

        if(head.data.equals(value)){
            head = head.next;
            tail.next = head;

            return;
        }

        Node<T> curr = head;

        do {
            if(curr.next.data.equals(value)){
                if(curr.next == tail){
                    tail = curr;
                }

                curr.next = curr.next.next;

                return;
            }

            curr = curr.next;
        }while(curr != head);
    }

    public void roundRobin(int steps){
        if(head == null){
            return;
        }

        Node<T> curr = head;

        while(head != tail){
            for(int i = 1; i < steps; i++){
                curr = curr.next;
            }

            System.out.print(curr.next.data + " -> ");

            Node<T> remove = curr.next;

            if(remove == tail){
                tail = curr;
            }

            curr.next = remove;

            if(curr.next == curr){
                break;
            }

            head = curr.next;
            curr = head;
        }

        System.out.println(head.data);
    }
}