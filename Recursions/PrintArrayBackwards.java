package Recursions;

public class PrintArrayBackwards {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr);
    }

    public static int reverseArray(int arr[]){
        return reverseArray(arr, arr.length - 1);
    }

    private static int reverseArray(int arr[], int arrLength){
        if(arrLength <= -1){
            return 0;
        }

        System.out.print(arr[arrLength]);

        return reverseArray(arr, arrLength - 1);
    }
}