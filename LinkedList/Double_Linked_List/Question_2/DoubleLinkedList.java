package LinkedList.Double_Linked_List.Question_2;

public class DoubleLinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public void add(T value){
        Node<T> curr = head;

        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
            tail = newNode;

            return;
        }

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
        tail = newNode;
    }

    public void printForward(){
        Node<T> curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");

            curr = curr.next;
        }

        System.out.println("null");
    }

    public void printBackward(){
        Node<T> curr = tail;

        while(curr != null){
            System.out.print(curr.data + " -> ");

            curr = curr.prev;
        }

        System.out.println("null");
    }

    public int size(){
        Node<T> curr = head;

        int count = 0;

        while(curr != null){
            count++;

            curr = curr.next;
        }

        return count;
    }

    public int search(T value){
        Node<T> curr = head;

        if(head == null){
            return -1;
        }

        int count = 0;

        while(curr != null){
            if(curr.data.equals(value)){
                return count;
            }

            count++;

            curr = curr.next;
        }

        return -1;
    }

    public void delete(T value){
        Node<T> curr = head;

        if(head == null){
            return;
        }

        if(head.data.equals(value)){
            head = head.next;

            return;
        }

        if(tail.data.equals(value)){
            tail = tail.prev;
            tail.next = null;

            return;
        }

        while(curr.next != null){
            if(curr.data.equals(value)){
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;

                return;
            }

            curr = curr.next;
        }
    }

    public void insertAtFront(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
            tail = newNode;

            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;
            tail = newNode;

            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void insertBefore(int index, T value){
        Node<T> newNode = new Node<>(value);
        Node<T> curr = head;

        if(head == null){
            return;
        }

        if(index == 0) {
            insertAtFront(value);

            return;
        }

        if(index == size() + 1){
            add(value);
        }

        int count = 0;

        while(curr != null){
            if(count == index){
                break;
            }

            count++;

            curr = curr.next;
        }

        newNode.next = curr;
        newNode.prev = curr.prev;
        curr.prev.next = newNode;
        curr.prev = newNode;
    }

    public boolean hasDuplicates(){
        Node<T> curr = head;

        while(curr != null){
            Node<T> next = curr.next;
            
            while(next != null) {
                if(next.data.equals(curr.data)){
                    return true;
                }
                
                next = next.next;
            }
        
            curr = curr.next;
        }

        return false;
    }

    public void removeDuplicates(){
        if(head == null){
            return;
        }

        Node<T> curr = head;

        while(curr != null){
            Node<T> next = curr.next;

            while(next != null){
                if(next.data.equals(curr.data)){
                    Node<T> remove = next;

                    next = next.next;
                    remove.prev.next = remove.next;

                    if(remove.next != null){
                        remove.next.prev = remove.prev;
                    }else{
                        tail = remove.prev;
                    }
                }else{
                    next = next.next;
                }
            }

            curr = curr.next;
        }
    }
}