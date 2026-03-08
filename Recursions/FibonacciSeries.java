package Recursions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number to calculate fibonacci: ");
        int num = scanner.nextInt();

        System.out.println("Fibonacci of " + num + " is: " + fibonacci(num));

        scanner.close();
    }

    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}