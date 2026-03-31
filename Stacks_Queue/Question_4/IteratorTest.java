package Stacks_Queue.Question_4;

public class IteratorTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements:");

        for(Integer value : stack){
            System.out.println(value);
        }

        System.out.println();

        Queue<Integer> queue = new Queue<>(10);

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        System.out.println("Queue elements:");

        for(Integer value : queue){
            System.out.println(value);
        }
    }
}