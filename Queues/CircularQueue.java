package Queues;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    CircularQueue(){
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return false;
        }
        data[end++] = item; //first insertion data[0] =  item and end=1
        end = end%data.length;// end = end%10 = 1%10 = 1
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty !!");
        }
        int removed = data[front++];
        front = front%data.length;

        size--;

        return removed;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int i = front;
        do{
            System.out.print(data[i]+" <-");
            i++;
            i %= data.length;
        }
        while (i!=end);

        System.out.println("END");
    }
}
