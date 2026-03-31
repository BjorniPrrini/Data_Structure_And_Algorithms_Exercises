package Stacks_Queue.Question_8;

public class ImplementQueueUsingStacksTest {
    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();

        System.out.println("Is empty? " + queue.isEmpty());

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("After pushing 1,2,3");

        System.out.println("Peek: " + queue.peek());

        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());

        queue.push(4);
        queue.push(5);

        System.out.println("After pushing 4,5");

        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());

        System.out.println("Is empty? " + queue.isEmpty());
    }
}