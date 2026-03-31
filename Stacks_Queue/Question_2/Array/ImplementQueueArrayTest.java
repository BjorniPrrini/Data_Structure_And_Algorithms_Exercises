package Stacks_Queue.Question_2.Array;

public class ImplementQueueArrayTest {
    public static void main(String[] args) {
        ImplementQueueArray<Integer> queue1 = new ImplementQueueArray<>();

        System.out.println("Is empty: " + queue1.isEmpty());
        System.out.println("Size: " + queue1.size());

        System.out.println("\nEnqueue elements:");
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);

        System.out.println("Size after enqueue: " + queue1.size());
        System.out.println("First element: " + queue1.first());

        try{
            System.out.println("Dequeue: " + queue1.dequeue());
            System.out.println("Dequeue: " + queue1.dequeue());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Size after dequeue: " + queue1.size());
        System.out.println("First element now: " + queue1.first());

        ImplementQueueArray<Integer> queue2 = new ImplementQueueArray<>(3);

        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);

        System.out.println("Size: " + queue2.size());
        System.out.println("First: " + queue2.first());

        try{
            System.out.println("Removed: " + queue2.dequeue());
            System.out.println("Removed: " + queue2.dequeue());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Size after removals: " + queue2.size());

        try{
            queue2.enqueue(5);
            queue2.enqueue(6);
            queue2.enqueue(7);
            queue2.enqueue(8);
        }catch(Exception e){
            System.out.println("Queue overflow caught");
        }

        ImplementQueueArray<Integer> queue3 = new ImplementQueueArray<>(2);

        try{
            queue3.dequeue();
        }catch(Exception e){
            System.out.println("Queue underflow caught");
        }
    }
}