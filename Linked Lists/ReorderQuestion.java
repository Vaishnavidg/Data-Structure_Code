package LINKEDLIST;

public class ReorderQuestion {

    private static ListNode head;
    private ListNode tail;
    private int size;

    public ReorderQuestion() {
        this.size=0;
    }

    public static void main(String[] args) {
        ReorderQuestion pq = new ReorderQuestion();

            pq.insertLast(1);
        pq.insertLast(0);
        pq.insertLast(1);

        pq.display();
        System.out.println(pq.getDecimalValue(head));
//        pq.rotateRight(head,1);
//        pq.reorderList(head);
//        pq.display();
    }

    //Q. Rotate the linked list
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null|| head.next == null||k<1){
            return head;
        }
        for(int i=1;i<=k;i++){
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;


            while(next!=null){
                prev= pres;
                pres = next;
                next = next.next;
            }
            prev.next = null;
            pres.next = head;

            head = pres;
        }
        return head;
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



    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;

    }
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
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
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode headfirst = head;
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        while(headfirst!=null && headSecond != null){
            ListNode temp = headfirst.next;
            headfirst.next = headSecond;
            headfirst = temp ;
            temp = headSecond.next;
            headSecond.next = headfirst;
            headSecond = temp;
        }
        if(headfirst !=null){
            headfirst.next = null;
        }
    }

    //  Reverse k groups
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k<=1 && head ==null){
            return head;
        }

        ListNode pres = head;
        ListNode prev =  null;
        while(pres!=null){
            //reverse the list
            ListNode newEnd = pres;
            ListNode last =  prev;
            ListNode next = pres.next;
            for(int i=0;i<k && pres!=null;i++) {
                pres.next = prev;
                prev = pres;
                pres = next;
                if(next!=null){
                    next = next.next;
                }

            }
            if(last!=null){
                last.next = prev;
            }else{
                head =prev;
            }
            newEnd.next = pres;



            for(int i = 0; pres!= null&&i<k ;i++){
                prev = pres;
                pres = pres.next;

            }
        }
        return head;


    }
    // convert to value
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return head.val;
        }
        ListNode node = head;
        ListNode last = head;
        int length = 0;
        int value =0;
        while(last!=null){
            length++;
            last = last.next;

        }
        for(int i = length-1;i>=0 && node!=null;i--){
            value += (node.val*(Math.pow(2,i)));
            node = node.next;

        }
        return value;

    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

