package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queues = new LinkedList<>();
        queues.add(10);
        queues.add(9);
        queues.add(13);
        queues.add(12);
        queues.add(6);

        System.out.println(queues.remove());
        System.out.println(queues.remove());

    }

}
