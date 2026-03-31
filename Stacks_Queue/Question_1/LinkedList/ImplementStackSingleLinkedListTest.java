package Stacks_Queue.Question_1.LinkedList;

public class ImplementStackSingleLinkedListTest {
    public static void main(String[] args) {
        ImplementStackSingleLinkedList<Integer> stack = new ImplementStackSingleLinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        System.out.println("Size: " + stack.size());

        System.out.println("Is empty: " + stack.isEmpty());
    }
}