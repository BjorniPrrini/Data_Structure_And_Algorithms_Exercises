package Array_ArrayList;

import java.util.Scanner;

public class StrictlyIdenticalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array1: ");
        int n1 = scanner.nextInt();

        int[] array1 = new int[n1];

        System.out.println("Enter size of array2: ");
        int n2 = scanner.nextInt();

        int[] array2 = new int[n2];

        System.out.println("Enter numbers for array1: ");

        for(int i = 0; i < n1; i++){
            System.out.print("Enter number: ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter numbers for array2: ");

        for(int i = 0; i < n2; i++){
            System.out.print("ENter number: ");
            array2[i] = scanner.nextInt();
        }

        if(equals(array1, array2)){
            System.out.println("Identical!");
        }else{
            System.out.println("Not identical!");
        }

        scanner.close();
    }

    public static boolean equals(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }

        for(int i = 0; i < array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }
}