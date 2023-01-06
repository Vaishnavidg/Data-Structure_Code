package LINKEDLIST;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }
    //Insert node at First
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;

    }
    //Insert node at given index.
    public void insertAtIndex(int val, int index){
        Node node = new Node(val);
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;


    }
    //Insert node at last
    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // delete the first node of the linked list
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;

    }
    // get the node
    public Node get(int index){
        Node temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    // delete at last index
    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        secondLast.next = null;
        tail = secondLast;
        size--;
        return val;
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node node = get(index);
        int val = node.value;
        Node previous = get(index-1);
        previous.next = node.next;
        return val;

    }



    //Display the list
    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    //Find Node
    public Node findNode(int value){
        Node node = head;
        while (node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }



    //Representation of LinkedList
    private  class Node{
       private int value;
       private Node next;

        public Node() {
        }

        public  Node(int value){
           this.value = value;
       }
       public  Node(int value,Node next){
           this.value = value;
           this.next = next;
       }
   }
}
