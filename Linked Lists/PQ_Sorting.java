package LINKEDLIST;

public class PQ_Sorting {
    private static ListNode head;
    private ListNode tail;
    private int size;

    public PQ_Sorting() {
        this.size=0;
    }
    
    public ListNode bubbleSort(){
       return bubbleSort(size-1,0);
    }

    private ListNode bubbleSort(int row, int col) {
        if(row==0){
            return head;
        }
        if(col<row){
            ListNode first = getNode(col);
            ListNode second = getNode(col+1);
            if(first.val>second.val){
                if(first == head){
                    first.next = second.next;
                    second.next = first;
                    head= second;
                } else if (second == tail) {
                    ListNode prev = getNode(col-1);
                    prev.next = second;
                    first.next = null;
                    second.next = first;
                    tail = first;
                }
                else{
                    ListNode prev = getNode(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next=first;
                }
            }
            bubbleSort(row,col+1);
        }
        bubbleSort(row-1,0);
        return head;
    }

    private ListNode getNode(int index) {
        ListNode node = head;
        if(index==0){
            return head;
        } else if (index==size-1) {
            return tail;
        }else{
            for(int i=1;i<=index;i++){
               node = node.next;
            }
        }
        return node;

    }


    //Q. Reverse linked list (Recursive)
    public void ReverseRec(ListNode node){
        if(node== tail){
            head = tail;
            return;

        }
        ReverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    //Reverse
    public void Reverse(){
        if(size<2){
            return;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
    }


    public void insertFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;

    }
       


        
    public void insertLast(int value){
        ListNode node = new ListNode(value);
        if(tail == null){
            tail = node;
            head = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }


    


    
    public void display(){
        ListNode temp = head;
        while(temp !=null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        PQ_Sorting pq = new PQ_Sorting();
       for (int i = 7;i>0;i--){
           pq.insertLast(i);
       }

        pq.display();
//       pq.bubbleSort();
//        pq.ReverseRec(head);
        pq.Reverse();
        pq.display();

    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    }


