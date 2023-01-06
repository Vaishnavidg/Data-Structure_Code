package Queues;

public class CustomQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    int ptr = 0;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.data = new int[size];
    }


    //Time Complexity of insertion is O(1)
    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return false;
        }
        data[ptr++] = item;
        return true;
    }

    //Time Complexity of removal is O(n)
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty !!");
        }
        int removed = data[0];
        for (int i=1;i< data.length;i++){
            data[i-1] = data[i];
        }
        ptr--;

        return removed;
    }

    public boolean isEmpty(){
        return ptr == 0;
    }

    public boolean isFull(){
        return ptr == data.length;
    }

    public void display(){
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]+" <-");
        }
        System.out.println("END");
    }

}
