package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(12);
        queue.insert(6);
        queue.insert(7);
        queue.insert(2);
        queue.insert(10);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.insert(45);

        queue.display();
    }
}
