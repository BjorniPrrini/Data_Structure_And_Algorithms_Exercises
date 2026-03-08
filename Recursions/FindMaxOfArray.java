package Recursions;

public class FindMaxOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};

        int max = findMax(arr);

        System.out.println("Max is: " + max);
    }

    private static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        return helperFindMax(arr, arr.length - 1, max);
    }

    private static int helperFindMax(int[] arr, int arrLength, int max){
        if(arrLength <= 0){
            return max;
        }

        if(arr[arrLength] > max){
            max = arr[arrLength];
        }

        return helperFindMax(arr, arrLength - 1, max);
    }   
}