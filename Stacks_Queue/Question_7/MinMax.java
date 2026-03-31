package Stacks_Queue.Question_7;

import java.util.Queue;
import java.util.Stack;

public class MinMax {
    public static <T extends Comparable<T>> T min(Stack<T> stack){
        Stack<T> tempStack = new Stack<>();

        T min = stack.peek();

        while(!stack.isEmpty()){
            T curr = stack.pop();

            if(curr.compareTo(min) < 0){
                min = curr;
            }

            tempStack.push(curr);
        }

        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

        return min;
    }

    public static <T extends Comparable<T>> T max(Stack<T> stack){
        Stack<T> tempStack = new Stack<>();

        T max = stack.peek();

        while(!stack.isEmpty()){
            T curr = stack.pop();

            if(curr.compareTo(max) > 0){
                max = curr;
            }

            tempStack.push(curr);
        }

        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

        return max;
    }

    public static <T extends Comparable<T>> T min(Queue<T> queue){
        T min = queue.peek();

        int size = queue.size();

        for(int i = 0; i < size; i++){
            T curr = queue.poll();

            if(curr.compareTo(min) < 0){
                min = curr;
            }

            queue.add(curr);
        }

        return min;
    }

    public static <T extends Comparable<T>> T max(Queue<T> queue){
        T max = queue.peek();

        int size = queue.size();

        for(int i = 0; i < size; i++){
            T curr = queue.poll();

            if(curr.compareTo(max) > 0){
                max = curr;
            }

            queue.add(curr);
        }

        return max;
    }
}