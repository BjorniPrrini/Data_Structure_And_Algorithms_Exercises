package Stacks_Queue.Question_1.Array;

public class ImplementStackArrayTest {
    public static void main(String[] args) {
        ImplementStackArray<Integer> stack1 = new ImplementStackArray<>();

        System.out.println("Is empty: " + stack1.isEmpty());

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        System.out.println("Size after pushes: " + stack1.size());
        System.out.println("Peek: " + stack1.peek());

        System.out.println("Pop: " + stack1.pop());
        System.out.println("Pop: " + stack1.pop());

        System.out.println("Size after pops: " + stack1.size());
        System.out.println("Is empty: " + stack1.isEmpty());

        ImplementStackArray<Integer> stack2 = new ImplementStackArray<>(3);

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.println("Size: " + stack2.size());
        System.out.println("Peek: " + stack2.peek());

        System.out.println("Pop: " + stack2.pop());
        System.out.println("Pop: " + stack2.pop());

        System.out.println("Size after pops: " + stack2.size());

        try{
            stack2.push(5);
            stack2.push(6);
            stack2.push(7);
            stack2.push(8);
        }catch(StackOverflowError e) {
            System.out.println("Stack overflow");
        }

        ImplementStackArray<Integer> stack3 = new ImplementStackArray<>(2);

        try{
            stack3.pop();
        }catch(Exception e){
            System.out.println("Stack underflow");
        }
    }
}