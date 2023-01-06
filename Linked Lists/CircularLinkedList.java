package LINKEDLIST;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
    }

    //Insert operation
    public void insert(int val){
        Node node = new Node(val);
        if(head ==null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    //Display
    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value +" ->");
                temp = temp.next;
            }while (temp!=head);
        }
        System.out.println("HEAD");
    }

    //delete
    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }
        if (node.value ==val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value ==val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    private class Node{
        int value ;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
