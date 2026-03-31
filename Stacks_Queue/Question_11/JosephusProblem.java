package Stacks_Queue.Question_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JosephusProblem {
    Queue<Integer> queue;

    JosephusProblem(){
        queue = new LinkedList<>();
    }

    public List<Integer> solution(int n, int k){
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            queue.add(i);
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j < k; j++){
                int num = queue.poll();

                queue.add(num);
            }

            list.add(queue.poll());
        }

        return list;
    }
}