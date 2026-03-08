package Recursions;

import java.util.Scanner;

public class Log2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int result = log2(num);

        System.out.println("Result: " + result);

        scanner.close();
    }

    private static int log2(int num){
        if(num <= 1){
            return 0;
        }

        return 1 + log2(num / 2);
    }
}