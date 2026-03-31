package Stacks_Queue.Question_8;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> stack;
    Stack<Integer> tempStack;

    ImplementQueueUsingStacks(){
        stack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(int value){
        stack.push(value);
    }

    public int pop(){
        if(tempStack.isEmpty()){
            while(!stack.isEmpty()){
                tempStack.push(stack.pop());
            }
        }

        return tempStack.pop();
    }

    public int peek(){
        if(tempStack.isEmpty()){
            while(!stack.isEmpty()){
                tempStack.push(stack.pop());
            }
        }

        return tempStack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty() && tempStack.isEmpty();
    }
}