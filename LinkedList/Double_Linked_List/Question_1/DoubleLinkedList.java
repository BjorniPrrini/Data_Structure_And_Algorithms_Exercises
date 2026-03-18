package LinkedList.Double_Linked_List.Question_1;

import java.util.ArrayList;

public class DoubleLinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public T set(int index, T value){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if(head == null){
            return null;
        }

        Node<T> curr = getNodeAtIndex(index);

        T oldData = curr.data;

        curr.data = value;

        return oldData;
    }

    private Node<T> getNodeAtIndex(int index){
        Node<T> curr;

        int size = size();

        if(index < size / 2){
            curr = head;

            for(int i = 0; i < index; i++){
                curr = curr.next;
            }
        }else{
            curr = tail;

            for(int i = size - 1; i > index; i--){
                curr = curr.prev;
            }
        }

        return curr;
    }

    private int size(){
        Node<T> curr = head;

        int count = 0;

        while(curr != null){
            count++;

            curr = curr.next;
        }

        return count;
    }

    public void add(int index, T value){
        if(index > size()){
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node<T> newNode = new Node<>(value);

        if(index == 0){
            if(head == null){
                head = tail = newNode;
            }else{
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }else if(index == size()){
            append(value);
        }else{
            Node<T> curr = getNodeAtIndex(index);

            newNode.next = curr;
            newNode.prev = curr.prev;
            curr.prev.next = newNode;
            curr.prev = newNode;
        }
    }

    public void append(T value){
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public T remove(int index){
        if(index >= size()){
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node<T> curr = getNodeAtIndex(index);

        T oldData = curr.data;

        if(curr.prev != null){
            curr.prev.next = curr.next;
        }else{
            head = curr.next;
        }

        if(curr.next != null){
            curr.next.prev = curr.prev;
        }else{
            tail = curr.prev;
        }

        return oldData;
    }

    public void addAll(DoubleLinkedList<T> otherList){
        Node<T> curr = otherList.head;

        while(curr != null){
            append(curr.data);

            curr = curr.next;
        }
    }

    public void addAll(int index, DoubleLinkedList<T> otherList){
        if(index > size()){
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node<T> curr = otherList.head;

        int i = 0;

        while(curr != null){
            add(index + i, curr.data);

            i++;

            curr = curr.next;
        }
    }

    public void removeAll(DoubleLinkedList<T> otherList){
        Node<T> otherListCurr = otherList.head;

        ArrayList<T> list = new ArrayList<>();

        while(otherListCurr != null){
            list.add(otherListCurr.data);

            otherListCurr = otherListCurr.next;
        }

        Node<T> curr = head;

        while(curr != null){
            Node<T> next = curr.next;

            if(list.contains(curr.data)){
                if(curr.prev == null){
                    head = curr.next;
                }else{
                    curr.prev.next = curr.next;
                }

                if(curr.next == null){
                    tail = curr.prev;
                }else{
                    curr.next.prev = curr.prev;
                }
            }

            curr = next;
        }
    }

    public void retainAll(DoubleLinkedList<T> otherList){
        Node<T> otherListCurr = otherList.head;

        ArrayList<T> list = new ArrayList<>();

        while(otherListCurr != null){
            list.add(otherListCurr.data);

            otherListCurr = otherListCurr.next;
        }

        Node<T> curr = head;

        while(curr != null){
            Node<T> next = curr.next;

            if(!list.contains(curr.data)){
                if(curr.prev == null){
                    head = curr.next;
                }else{
                    curr.prev.next = curr.next;
                }

                if(curr.next == null){
                    tail = curr.prev;
                }else{
                    curr.next.prev = curr.prev;
                }
            }

            curr = next;
        }
    }
}