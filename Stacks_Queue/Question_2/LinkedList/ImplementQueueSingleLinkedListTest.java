package Stacks_Queue.Question_2.LinkedList;

public class ImplementQueueSingleLinkedListTest {
    public static void main(String[] args) {
        ImplementQueueSingleLinkedList<Integer> queue = new ImplementQueueSingleLinkedList<>();

        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());

        try{
            queue.first();
        }catch(Exception e){
            System.out.println("First on empty queue caught: " + e.getMessage());
        }

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Size after enqueue: " + queue.size());

        try{
            System.out.println("First element: " + queue.first());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Removed: " + queue.dequeue());
            System.out.println("Removed: " + queue.dequeue());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Size after dequeue: " + queue.size());

        try{
            System.out.println("First element now: " + queue.first());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Removed: " + queue.dequeue());
            System.out.println("Removed: " + queue.dequeue());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Is Empty: " + queue.isEmpty());

        try{
            queue.dequeue();
        }catch(Exception e){
            System.out.println("Dequeue on empty queue caught: " + e.getMessage());
        }
    }
}