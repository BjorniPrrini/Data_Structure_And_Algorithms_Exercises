package Stacks_Queue.Question_10;

public class DropoutStackTest {
    public static void main(String[] args) {
        DropoutStackADT<Integer> stack = new DropoutStackADT<>(3);

        stack.push(1);
        print(stack);

        stack.push(2);
        print(stack);

        stack.push(3);
        print(stack);

        stack.push(4);
        print(stack);

        stack.push(5);
        print(stack);

        System.out.println("Top: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        print(stack);

        System.out.println("Pop: " + stack.pop());
        print(stack);

        System.out.println("Pop: " + stack.pop());
        print(stack);

        try{
            stack.pop();
        }catch(Exception e){
            System.out.println("Exception caught (pop on empty)");
        }

        try{
            stack.peek();
        } catch(Exception e){
            System.out.println("Exception caught (peek on empty)");
        }
    }

    private static <T> void print(DropoutStackADT<T> stack){
        System.out.print("Stack: [");

        for(int i = 0; i < stack.size; i++){
            int index = (stack.start + i) % stack.capacity;
           
            System.out.print(stack.arr[index]);

            if(i < stack.size - 1){
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}