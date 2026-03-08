package Array_ArrayList;

import java.util.Scanner;

public class ArgumentsMinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Max: " + max(3, 7, 2, 9, 1, 5, 23, 135, 4));
        System.out.println("MMin " + min(3, 7, 2, 9, 1, 5, 23, 135, 4));

        System.out.println();

        System.out.println("Max: " + max(-5, -1, -8));
        System.out.println("Min: " + min(-5, -1, -8));

        scanner.close();
    }

    public static int max(int... n){
        int max = Integer.MIN_VALUE;

        for(int num : n){
            if(num > max){
                max = num;
            }
        }

        return max;
    }

    public static int min(int... n){
        int min = Integer.MAX_VALUE;

        for(int num : n){
            if(num < min){
                min = num;
            }
        }

        return min;
    }
}