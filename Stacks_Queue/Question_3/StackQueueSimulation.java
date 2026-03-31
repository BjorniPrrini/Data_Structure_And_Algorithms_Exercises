package Stacks_Queue.Question_3;

import java.util.*;

public class StackQueueSimulation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        Object[][] operations = {{"add", 1}, {"add", 2}, {"add", 3}, {"remove", null}, {"add", 4}, {"remove", null}, {"add", 5}};

        for(Object[] op : operations){
            String action = (String) op[0];

            if(action.equals("add")){
                int value = (int) op[1];

                stack.push(value);

                queue.add(value);
            }else if(action.equals("remove")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                
                if(!queue.isEmpty()){
                    queue.remove();
                }
            }

            System.out.println("Stack: " + stack + " | Queue: " + queue);
        }
    }
}