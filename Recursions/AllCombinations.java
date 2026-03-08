package Recursions;

import java.util.ArrayList;
import java.util.List;

public class AllCombinations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> combinations = getCombinations(arr);

        for(List<Integer> list : combinations){
            System.out.println(list);
        }
    }
    
    public static List<List<Integer>> getCombinations(int[] arr){
        List<List<Integer>> result = new ArrayList<>();

        generate(arr, 0, new ArrayList<>(), result);

        return result;
    }

    private static void generate(int[] arr, int index, List<Integer> current, List<List<Integer>> result){
        if(index == arr.length){
            result.add(new ArrayList<>(current));

            return;
        }

        generate(arr, index + 1, current, result);

        current.add(arr[index]);

        generate(arr, index + 1, current, result);

        current.remove(current.size() - 1);
    }
}