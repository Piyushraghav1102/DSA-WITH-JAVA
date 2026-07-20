
import java.util.List;

import org.w3c.dom.Node;

public class LC_203_RemoveLLele {

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
       

    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void Display(ListNode Start) {
        
        if (Start == null) {
            System.out.println("Linked list is Empty");
        } else {
            ListNode temp = Start;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }

        }
    }
  
    public static ListNode reverseList(ListNode head) {
       
        ListNode curr=head;
        ListNode rear=head;
        ListNode prev=null;

        while(curr!=null){
            curr.next = prev;
            rear.next=curr;
            prev=curr;
        }
 return prev;       
    }

        public static void main(String[] args) {

            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(1);
            ListNode l4 = new ListNode(4);

            l1.next = l2;
            l2.next = l3;
            l3.next = l4;

           // ListNode temp =LC_203_RemoveLLele.removeElements(l1, 1);
            ListNode temp =reverseList(l1);
           
            Display(temp);
        }
    }
