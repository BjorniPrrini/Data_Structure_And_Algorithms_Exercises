package LinkedList.Single_Linked_List.Question_3;

public class MyList<T> {
    Node<T> head;

    public int size(){
        Node<T> curr = head;

        if(head == null){
            return 0;
        }

        int count = 0;

        while(curr != null){
            count++;

            curr = curr.next;
        }

        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean exists(T value){
        Node<T> curr = head;

        while(curr != null){
            if(curr.data.equals(value)){
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    public Object[] toArray(){
        Node<T> curr = head;

        Object[] array = new Object[size()];

        if(head == null){
            return new Object[0];
        }

        int i = 0;

        while(curr != null){
            array[i++] = curr.data;

            curr = curr.next;
        }

        return array;
    }

    public T getValueByIndex(int index){
        Node<T> curr = head;

        int count = 1;

        while(curr != null){
            if(count == index){
                return curr.data;
            }

            count++;

            curr = curr.next;
        }

        return null;
    }

    public void append(T data){
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head = newNode;
        }else{
            Node<T> curr = head;

            while(curr.next != null){
                curr = curr.next;
            }

            curr.next = newNode;
        }
    }

    public void removeAtIndex(int index){
        Node<T> curr = head;

        int count = 1;

        if(index == 1){
            head = head.next;

            return;
        }

        while(curr != null){
            if(count == index - 1){
                curr.next = curr.next.next;

                return;
            }

            count++;

            curr = curr.next;
        }
    }

    public void insertAtIndex(T data, int index){
        Node<T> newNode = new Node<>(data);

        Node<T> curr = head;

        int count = 1;

        if(index == 1){
            newNode.next = head;

            head = newNode;

            return;
        }

        if(index > size()){
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        while(curr != null){
            if(count == index - 1){
                newNode.next = curr.next;

                curr.next = newNode;

                return;
            }

            count++;

            curr = curr.next;
        }
    }

    public int indexOf(T data){
        if(head == null){
            return -1;
        }

        Node<T> curr = head;

        int count = 1;

        while(curr != null){
            if(curr.data.equals(data)){
                return count;
            }

            count++;

            curr = curr.next;
        }

        return -1;
    }

    public int lastIndexOf(T data){
        Node<T> curr = head;

        if(head == null){
            return -1;
        }

        int index = -1;
        int count = 1;

        while(curr != null){
            if(curr.data.equals(data)){
                index = count;
            }

            count++;

            curr = curr.next;
        }

        return index;
    }
}