package problems;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {

    public static Queue<Integer> reverseFistK(Queue<Integer> queue, int k) {
        solveQueue(queue, k);
        int n = queue.size() - k;
        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;

    }

    private static void solveQueue(Queue<Integer> queue, int k) {
        if (k == 0) return;
        int element = queue.remove();
        solveQueue(queue, k - 1);
        queue.add(element);
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(reverseFistK(queue, 3));
    }
}
