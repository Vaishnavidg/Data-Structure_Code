package LINKEDLIST;

public class Practice_Questions {

    private Node head;
    private Node tail;
    private int size;
    public Practice_Questions(){
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
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = node;
            head = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    //1. Recursive Insertion in Linked list
    public void insertRec(int value, int index){
        head = insertRec(value,index,head);

    }
    private Node insertRec(int value, int index,Node node){
        if(index == 0 ){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value,index-1,node.next);
        return node;
    }

    //2.Remove Duplication
    public void removeDuplication(){
        Node temp = head;
        while(temp.next!=null){

            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    //Q3. Merge two sorted linked list
    public static Practice_Questions mergeTwoLists(Practice_Questions list1, Practice_Questions list2) {
        Node node1 = list1.head;
        Node node2 = list2.head;
        Practice_Questions ans = new Practice_Questions();
        while(node1 !=null && node2 !=null){
            if(node1.value <= node2.value){
                ans.insertLast(node1.value);
                node1 = node1.next;
            }
            else{
                ans.insertLast(node2.value);
                node2 = node2.next;
            }
        }
        while (node1!=null){
            ans.insertLast(node1.value);
            node1 = node1.next;
        }

        while(node2!=null){
            ans.insertLast(node2.value);
            node2 = node2.next;
        }
        return ans;

    }

    //3. Happy Number
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do{
            fast = square(square(fast));
            slow = square(slow);
        }while(fast!=slow);
        if(slow ==1){
            return true;
        }
        return false;

    }

    private int square(int num){
        int ans =0;
        while(num>0){
            int rem = num%10;
            ans += rem*rem;
            num = num/10;
        }
        return  ans;
    }




    //Display the list
    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    class Node{
        private int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        Practice_Questions list = new Practice_Questions();
        list.insertFirst(4);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(1);
        list.insertFirst(1);
//        list.insertRec(10,2);
        list.display();
        list.removeDuplication();
        list.display();
    }
}
