package LinkedList.Single_Linked_List.Question_4;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void add(T value){
        Node<T> curr = head;
        Node<T> newNode = new Node<>(value);

        if(head == null){
            head = newNode;

            return;
        }

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public int sum(){
        if(head == null){
            return 0;
        }

        int sum = 0;

        Node<T> curr = head;

        while(curr != null){
            sum += (int)curr.data;

            curr = curr.next;
        }

        return sum;
    }

    public int max(){
        if(head == null){
            return 0;
        }

        Node<T> curr = head;

        int max = Integer.MIN_VALUE;

        while(curr != null){
            if((int)curr.data > max){
                max = (int)curr.data;
            }

            curr = curr.next;
        }

        return max;
    }

    public int count(T value){
        if(head == null){
            return 0;
        }

        Node<T> curr = head;
        int count = 0;

        while(curr != null){
            if(curr.data.equals(value)){
                count++;
            }

            curr = curr.next;
        }

        return count;
    }

    public void deleteAllDuplicates(){
        if(head == null){
            return;
        }

        Node<T> curr = head;

        while(curr != null){
            Node<T> next = curr;

            while(next.next != null){
                if(next.next.data.equals(curr.data)){
                    next.next = next.next.next;
                }else{
                    next = next.next;
                }
            }

            curr = curr.next;
        }
    }

    public void deleteAll(T value){
        if(head == null){
            return;
        }

        while(head != null && head.data.equals(value)){
            head = head.next;
        }

        Node<T> curr = head;

        while(curr.next != null){
            if(curr.next.data.equals(value)){
                curr.next = curr.next.next;
            }

            curr = curr.next;
        }
    }

    public ArrayList<Integer> toArray(){
        if(head == null){
            return new ArrayList<>(0);
        }

        Node<T> curr = head;

        ArrayList<Integer> list = new ArrayList<>();

        while(curr != null){
            list.add((int)curr.data);

            curr = curr.next;
        }

        return list;
    }

    public void printRecursive(){
        printRecursive(head);
    }

    private void printRecursive(Node<T> h){
        if(h == null){
            return;
        }

        System.out.println(h.data + " -> ");
        
        printRecursive(h.next);
    }

    public void printRecursiveReverse(){
        printRecursiveReverse(head);
    }

    private void printRecursiveReverse(Node<T> h){
        if(h == null){
            return;
        }
        
        printRecursiveReverse(h.next);

        System.out.println(h.data + " -> ");
    }

    public void sort(){
        if(head == null){
            return;
        }

        ArrayList<T> list = new ArrayList<>();
        Node<T> curr = head;

        while(curr != null){
            list.add(curr.data);

            curr = curr.next;
        }

        Collections.sort(list);

        curr = head;

        for(T i : list){
            curr.data = i;
            curr = curr.next;
        }
    }

    public void insertSorted(T value){
        if(head == null){
            return;
        }

        ArrayList<T> list = new ArrayList<>();
        Node<T> curr = head;

        list.add(value);

        while(curr != null){
            list.add(curr.data);

            curr = curr.next;
        }

        Collections.sort(list);

        curr = head;

        for(T i : list){
            curr.data = i;
            curr = curr.next;
        }
    }

    public void addList(LinkedList<T> otherList){
        Node<T> curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = otherList.head;
    }

    public boolean isPalindrome(){
        if(head == null){
            return true;
        }

        ArrayList<T> list = new ArrayList<>();
        Node<T> curr = head;

        while(curr != null){
            list.add(curr.data);

            curr = curr.next;
        }

        int point1 = 0;
        int point2 = list.size() - 1;

        for(int i = 0; i < list.size() / 2; i++){
            if(!list.get(point1).equals(list.get(point2))){
                return false;
            }

            point1++;
            point2--;
        }

        return true;
    }
}