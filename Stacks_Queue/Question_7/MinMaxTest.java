package Stacks_Queue.Question_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MinMaxTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        System.out.println("Original Stack: " + stack);
        System.out.println("Stack Min: " + MinMax.min(stack));
        System.out.println("Stack after min(): " + stack);
        System.out.println("Stack Max: " + MinMax.max(stack));
        System.out.println("Stack after max(): " + stack);

        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(5);
        queue.add(2);
        queue.add(8);
        queue.add(1);

        System.out.println("Original Queue: " + queue);
        System.out.println("Queue Min: " + MinMax.min(queue));
        System.out.println("Queue after min(): " + queue);
        System.out.println("Queue Max: " + MinMax.max(queue));
        System.out.println("Queue after max(): " + queue);
    }
}