package LinkedList.Question_1.Part_C;

import java.util.Scanner;

public class LinkedList<T>{
    private Node<T> head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        int choice = 1;

        while(choice != 0){
            System.out.print("Enter choice, 1 - add, 2 - delete, 3 - traverse, 4 - size, 5 - search, 6 - get first number, 7 - get last number, 8 - is empty, 9 - insert at the front, 10 - insert at the end, 11 - insert at position, 12 - delete at front, 13 - delete at end, 14 - delete by value, 0 - end: ");
            choice = scanner.nextInt();

            if(choice == 0){
                break;
            }else if(choice == 1){
                System.out.print("Enter how many numbers to enter: ");
                int n = scanner.nextInt();

                for(int i = 0; i < n; i++){
                    System.out.print("Enter number: ");
                    int num = scanner.nextInt();

                    list.add(num);
                }
            }else if(choice == 2){
                System.out.print("Enter number to delete: ");
                int numDel = scanner.nextInt();

                list.delete(numDel);
            }else if(choice == 3){
                list.traverse();
            }else if(choice == 4){
                System.out.println("Linked list size: " + list.size());
            }else if(choice == 5){
                System.out.print("Enter number to search: ");
                int num = scanner.nextInt();

                if(list.search(num)){
                    System.out.println("Number found.");
                }else{
                    System.out.println("NUmber not found.");
                }
            }else if(choice == 6){
                System.out.println("First number: " + list.getFirst());
            }else if(choice == 7){
                System.out.println("Last number: " + list.getLast());
            }else if(choice == 8){
                System.out.println("IsEmpty: " + list.isEmpty());
            }else if(choice == 9){
                System.out.println("Enter number to insert at the front: ");
                int numFront = scanner.nextInt();

                list.insertAtFront(numFront);
            }else if(choice == 10){
                System.out.println("Enter number to insert at the end: ");
                int numEnd = scanner.nextInt();

                list.insertAtEnd(numEnd);
            }else if(choice == 11){
                System.out.println("Enter number to insert at position: ");
                int pos = scanner.nextInt();
                System.out.println("Enter number: ");
                int numPos = scanner.nextInt();

                list.insertAtPosition(numPos, pos);
            }else if(choice == 12){
                list.deleteAtFront();
            }else if(choice == 13){
                list.deleteAtEnd();
            }else if(choice == 14){
                System.out.println("Enter number to delete: ");
                int value = scanner.nextInt();

                list.deleteByValue(value);
            }else{
                System.out.println("Only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 0");
            }
        }

        scanner.close();
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);

        if(head == null){
            head = newNode;

            return;
        }

        Node<T> curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void delete(T data){
        if(head == null){
            System.out.println("No items in linked list.");

            return;
        }

        if(head.data.equals(data)){
            head = head.next;

            return;
        }

        Node<T> curr = head;

        while(curr.next != null){
            if(curr.next.data.equals(data)){
                curr.next = curr.next.next;

                return;
            }

            curr = curr.next;
        }
    }

    public void traverse(){
        Node<T> curr = head;

        System.out.println();

        if(head == null){
            System.out.println("List is empty");

            return;
        }

        while(curr != null){
            System.out.print("Data: " + curr.data + " -> ");

            curr = curr.next;
        }

        System.out.println("null");
    }

    private int size(){
        int count = 0;

        Node<T> curr = head;

        while(curr != null){
            count++;

            curr = curr.next;
        }

        return count;
    }

    private boolean search(T num){
        Node<T> curr = head;

        while(curr != null){
            if(curr.data.equals(num)){
                return true;
            }

            curr = curr.next;
        }

        return false;
    }

    private T getFirst(){
        if(head == null){
            System.out.println("No nodes in the list.");

            return null;
        }

        return (T)head.data;
    }

    private T getLast(){
        if(head == null){
            System.out.println("No nodes in the list.");

            return null;
        }

        Node<T> curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        return curr.data;
    }

    private boolean isEmpty(){
        return head == null;
    }

    private void insertAtFront(T numAtFront){
        Node<T> newNode = new Node<>(numAtFront);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    private void insertAtEnd(T numAtEnd){
        Node<T> newNode = new Node<>(numAtEnd);

        Node<T> curr = head;

        if(head == null){
            head = newNode;
        }else{
            while(curr.next != null){
                curr = curr.next;
            }

            curr.next = newNode;
        }
    }

    private void insertAtPosition(T numPos, int pos){
        Node<T> newNode = new Node<>(numPos);

        Node<T> curr = head;

        int count = 1;

        if(pos == 1){
            insertAtFront(numPos);

            return;
        }
        
        while(curr != null && count < pos - 1){
            curr = curr.next;

            count++;
        }

        if(curr == null){
            System.out.println("Position out of range");

            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    private void deleteAtFront(){
        if(head == null){
            System.out.println("No nodes.");

            return;
        }else{
            head = head.next;
        }
    }

    private void deleteAtEnd(){
        Node<T> curr = head;

        if(head == null){
            System.out.println("No nodes.");

            return;
        }else{
             if(head.next == null){
                head = null;
                
                return;
            }

            while(curr.next.next != null){
                curr = curr.next;
            }

            curr.next = null;
        }
    }

    private void deleteByValue(T value){
        Node<T> curr = head;

        if(head == null){
            System.out.println("No nodes in the list.");

            return;
        }

        if(head.data.equals(value)){
            head = head.next;

            return;
        }

        while(curr.next != null){
            if(value.equals(curr.next.data)){
                curr.next = curr.next.next;

                return;
            }

            curr = curr.next;
        }

        System.out.println("Value not found");
    }
}