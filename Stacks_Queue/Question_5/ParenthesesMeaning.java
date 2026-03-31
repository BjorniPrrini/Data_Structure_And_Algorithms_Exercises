package Stacks_Queue.Question_5;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesMeaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter equation: ");
        String equation = scanner.nextLine();

        if(checkEquationBrackets(equation)){
            System.out.println("Equation is correct");
        }else{
            System.out.println("Equation is not correct");
        }

        scanner.close();
    }

    private static boolean checkEquationBrackets(String equation){
        Stack<Character> stack = new Stack<>();

        for(char e : equation.toCharArray()){
            if(e == '(' || e == '{' || e == '['){
                stack.push(e);
            }else if(e == ')' || e == '}' || e == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char topBracket = stack.pop();

                if((e == ')' && topBracket != '(') || (e == '}' && topBracket != '{') || (e == ']' && topBracket != '[')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}