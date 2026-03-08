package Recursions;

import java.util.Scanner;

public class ReverseIntegerDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numb: ");
        int num = scanner.nextInt();

        reverse(num);

        scanner.close();
    }

    public static int reverse(int num){
        if(num <= 0){
            return num;
        }

        System.out.print(num % 10);

        return reverse(num / 10);
    }
}