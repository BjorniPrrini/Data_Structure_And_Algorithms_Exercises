package Array_ArrayList;

import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers to put in array: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            array[i] = scanner.nextDouble();
        }

        System.out.println("Average: " + average(array));

        scanner.close();
    }

    public static int average(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double average(double[] array){
        double sum = 0.0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return sum / array.length;
    }
}