package Recursions;

public class EvenBeforeOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        evenBeforeOdd(arr, 0, arr.length - 1);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    private static void evenBeforeOdd(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        if(arr[left] % 2 == 0){
            evenBeforeOdd(arr, left + 1, right);
        }else if(arr[right] % 2 == 1){
            evenBeforeOdd(arr, left, right - 1);
        }else{
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            evenBeforeOdd(arr, left + 1, right - 1);
        }
    }
}