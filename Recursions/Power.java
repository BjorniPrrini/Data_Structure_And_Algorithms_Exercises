package Recursions;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.print("Enter power: ");
        int pow = scanner.nextInt();

        double result = generatePower(num, pow);

        System.out.print("Result: " + result);

        scanner.close();
    }

    private static double generatePower(int num, int pow){
        if(pow == 0){
            return 1;
        }else if(pow >= 0){
            return num * generatePower(num, pow - 1);
        }else{
            return (1.0 / num) * generatePower(num, pow + 1);
        }
    }
}