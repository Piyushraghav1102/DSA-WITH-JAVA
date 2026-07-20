public class Lc21mergesortlists {
  
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void Diplay(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;

        }
        System.out.println();
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp3=dummy;

        while (temp1 != null && temp2 != null) {

            if (temp1.val < temp2.val) {
                ListNode a = new ListNode(temp1.val);
                temp3.next = a;
                temp3 = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.val);
                temp3.next = a;
                temp3 = a;
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            ListNode a = new ListNode(temp1.val);
            temp3.next = a;
            temp3 = a;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            ListNode a = new ListNode(temp2.val);
            temp3.next = a;
            temp3 = a;
            temp2 = temp2.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        //connection of LL1
        a.next = b;
        b.next = c;
        c.next = d;


        ListNode e = new ListNode(3);
        ListNode f = new ListNode(6);
        //connection of the LL2
        e.next = f; 

        Diplay(a);
        Diplay(e);
        
        ListNode x = mergeTwoLists(a, e);
        Diplay(x);
        
    }
}