package Array_ArrayList;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] grades = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter grade: ");
            grades[i] = scanner.nextInt();
        }

        printGrades(grades);

        System.out.println("AVG: " + calcAverage(grades));

        System.out.println("Highest: " + findMax(grades));

        System.out.println("Lowest: " + findMin(grades));

        System.out.println("Above avg: " + countAboveAvg(grades, calcAverage(grades)));

        scanner.close();
    }

    public static void printGrades(int[] grades){
        System.out.print("Grades: ");

        for(int g : grades){
            System.out.print(g + " ");
        }
    }

    public static double calcAverage(int[] grades){
        double sum = 0.0;

        for(int g : grades){
            sum += g;
        }

        return sum / grades.length;
    }

    public static int findMax(int[] grades){
        int max = Integer.MIN_VALUE;

        for(int g : grades){
            if(g > max){
                max = g;
            }
        }

        return max;
    }

    public static int findMin(int[] grades){
        int min = Integer.MAX_VALUE;

        for(int g : grades){
            if(g < min){
                min = g;
            }
        }

        return min;
    }

    public static int countAboveAvg(int[] grades, double avg){
        int count = 0;

        for(int g : grades){
            if(g > avg){
                count++;
            }
        }

        return count;
    }
}