public class Lc142LLcycle_II {
    
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public static void Diplay(ListNode head) {
        ListNode temp = head;
        
        while (temp != null) {
            System.out.print(temp.val+""+"->");
            temp = temp.next;
        
        }
        System.out.println();
    }

    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        
        if(head==null || head.next==null  ){
            return null;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                break;

        }
        
        if (fast == null || fast.next == null) {
            return null; // NO cycle
        }
        
        slow = head;
        int count=0;
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
            count++;
        }
        return slow;

    }
    
    public static ListNode ReverseLL(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        ListNode a = new ListNode(100);
        ListNode b = new ListNode(200);
        ListNode c = new ListNode(300);
        ListNode d = new ListNode(400);
        ListNode e = new ListNode(500);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        

        //Diplay(a);

        //ListNode tem = detectCycle(a);


        Diplay(a);
        ListNode tem = ReverseLL(a);
        Diplay(tem);


    }
}