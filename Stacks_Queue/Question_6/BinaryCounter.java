package Stacks_Queue.Question_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BinaryCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        List<String> list = binaryCounter(n);

        System.out.println("List: " + list);

        scanner.close();
    }

    public static List<String> binaryCounter(int n){
        List<String> list = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for(int i = 0; i < n; i++){
            String num = queue.poll();

            list.add(num);

            queue.add(num + "0");
            queue.add(num + "1");
        }

        return list;
    }
}