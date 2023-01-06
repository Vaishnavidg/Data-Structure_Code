package LINKEDLIST;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }
    //Get Node at specific index
    public Node getNode(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //Insertion Operations
    //1.Insert at First
    public void insertAtFirst(int val){
        Node node = new Node(val);
        if(head!=null){
            head.previous = node;
        }
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    //2.Insert at End
    public void insertAtLast(int val){
        Node node = new Node(val);
        if(head ==null){
            head = node;
        }
        tail.next = node;
        node.previous = tail;
        tail = node;
        size++;
    }
    //3.Insert at Index
    public void insertAtIndex(int val,int index){
        Node node = new Node(val);
        if(index==0){
            insertAtFirst(val);
        }
        if(index ==size){
            insertAtLast(val);
        }
        Node temp = getNode(index -1);
        node.next = temp.next;

        temp.next = node;
        if(temp.next!=null){
            node.previous = temp;
        }

        size++;

    }

    //DELETE OPERATION
    //1. Delete at first
    public int deleteAtFirst(){
        int val = head.value;
        head = head.next;
        head.previous = null;
        if(head ==null){
            tail = null;
        }
        size--;
        return val;
    }

    //2.Delete at last
    public int deleteAtLast(){
        if(size<=1){
            deleteAtFirst();
        }
        int val = tail.value;
        Node secondLast = getNode(size-2);
        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;
    }
    //3.Delete at index
    public int deleteAtIndex(int index){
        if(index==0){
            deleteAtFirst();
        }
        if(index==size-1){
            deleteAtLast();
        }
        Node previous = getNode(index-1);
        Node node = getNode(index);
        int val = node.value;
        previous.next = node.next;
        node.next.previous = previous;
        size--;
        return val;
    }

    //Display
    public void Display(){
        Node temp = head;
        Node last = null;
        while(temp !=null){
            System.out.print(temp.value +"->");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println("Print in reverse order");

        while (last!=null){
            System.out.print(last.value +"->");
            last = last.previous;
        }
        System.out.print("START");
    }








    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
