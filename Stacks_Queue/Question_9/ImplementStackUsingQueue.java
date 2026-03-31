package Stacks_Queue.Question_9;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue<T> {
    Queue<T> queue;

    ImplementStackUsingQueue(){
        queue = new LinkedList<>();
    }

    public void push(T value){
        queue.add(value);

        int size = queue.size();

        for(int i = 0; i < size - 1; i++){
            queue.add(queue.remove());
        }
    }

    public T pop(){
        return queue.poll();
    }

    public T top(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}