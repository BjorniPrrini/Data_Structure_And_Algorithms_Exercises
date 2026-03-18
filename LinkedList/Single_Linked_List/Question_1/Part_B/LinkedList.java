package LinkedList.Single_Linked_List.Question_1.Part_B;

import java.util.Scanner;

public class LinkedList<T>{
    private Node<T> head;

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

        while(curr != null){
            System.out.print("Data: " + curr.data + " -> ");

            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        int choice = 1;

        while(choice != 0){
            System.out.print("Enter choice, 1 - add, 2 - delete, 3 - traverse, 0 - end: ");
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
            }else{
                System.out.println("Only 1, 2, 3, 0");
            }
        }

        scanner.close();
    }
}