package Stacks_Queue.Question_11;

import java.util.List;

public class JosephusProblemTest {
    public static void main(String[] args) {
        JosephusProblem josephusProblem = new JosephusProblem();

        List<Integer> result1 = josephusProblem.solution(7, 3);

        System.out.println("Expected: [3, 6, 2, 7, 5, 1, 4]");
        System.out.println(result1);
        System.out.println();

        List<Integer> result2 = josephusProblem.solution(5, 1);

        System.out.println("Expected: [1, 2, 3, 4, 5]");
        System.out.println(result2);
        System.out.println();

        List<Integer> result3 = josephusProblem.solution(5, 5);

        System.out.println("Expected: [5, 1, 3, 4, 2]");
        System.out.println(result3);
        System.out.println();

        List<Integer> result4 = josephusProblem.solution(1, 3);

        System.out.println("Expected: [1]");
        System.out.println(result4);
        System.out.println();

        List<Integer> result5 = josephusProblem.solution(3, 2);

        System.out.println("Expected: [2, 1, 3]");
        System.out.println(result5);
        System.out.println();
        
        List<Integer> result6 = josephusProblem.solution(10, 4);

        System.out.println("Expected: [4, 8, 2, 7, 3, 10, 9, 1, 6, 5]");
        System.out.println(result6);
        System.out.println();
    }
}