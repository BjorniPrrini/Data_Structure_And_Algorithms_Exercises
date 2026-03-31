package Stacks_Queue.Question_9;

public class ImplementStackUsingQueueTest {
    public static void main(String[] args) {
        ImplementStackUsingQueue<Integer> stack = new ImplementStackUsingQueue<>();

        System.out.println("Pushing elements: 1, 2, 3");

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Pop from empty: " + stack.pop());

        System.out.println("\nPushing elements: 10, 20");

        stack.push(10);
        stack.push(20);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Final pop (empty): " + stack.pop());

        System.out.println("Is empty: " + stack.isEmpty());
    }
}