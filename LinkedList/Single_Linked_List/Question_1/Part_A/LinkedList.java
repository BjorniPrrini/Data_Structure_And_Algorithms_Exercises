package LinkedList.Single_Linked_List.Question_1.Part_A;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node head = null;

        int choice = 1;

        while(choice != 0){
            System.out.println();
            
            System.out.print("Enter choice, 1 - add, 2 - delete, 3 - transverse, 0 - end: ");
            choice = scanner.nextInt();

            if(choice == 0){
                break;
            }else if(choice == 1){
                System.out.print("Enter how many numbers to enter: ");
                int n = scanner.nextInt();

                for(int i = 0; i < n; i++){
                    System.out.print("Enter number: ");
                    int num = scanner.nextInt();

                    head = addNumberToList(head, num);
                }
            }else if(choice == 2){
                System.out.print("Enter number to delete: ");
                int numDel = scanner.nextInt();

                head = deleteNumberFromList(head, numDel);
            }else if(choice == 3){
                Node curr = head;

                System.out.println();

                while(curr != null){
                    System.out.print("Data: " + curr.data + " -> ");

                    curr = curr.next;
                }

                System.out.print("null");
            }else{
                System.out.println("Only 1, 2, 3, 0");
                continue;
            }
        }

        scanner.close();
    }

    private static Node deleteNumberFromList(Node head, int numDel){
        Node curr = head;

        if(head == null){
            System.out.println("No items in linked list.");

            return null;
        }

        if(head.data == numDel){
            return head.next;
        }

        while(curr.next != null){
            if(numDel == curr.next.data){
                curr.next = curr.next.next;

                return head;
            }

            curr = curr.next;
        }

        return head;
    }

    private static Node addNumberToList(Node head, int num){
        Node newNode = new Node(num);

        if(head == null){
            head = newNode;

            return newNode;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;

        return head;
    }
}