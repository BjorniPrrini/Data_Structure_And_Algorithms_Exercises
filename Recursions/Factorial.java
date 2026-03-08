package Recursions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for factorial: ");
        int num = scanner.nextInt();

        System.out.println("Factorial of " + num + " is: " + factorial(num));

        scanner.close();
    }

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }

        return num * factorial(num - 1);
    }
}