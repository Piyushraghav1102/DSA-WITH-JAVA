
import java.awt.DisplayMode;
import java.util.LinkedList;

public class reverse {
    
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    
    public static Node ReverseLLRecu(Node head ) {
        if (head.next == null) {
            return head;
        }

        Node newhead = ReverseLLRecu(head.next);

        head.next.next = head;
        head.next = null;

        return newhead;
    }

    public static Node Reverse_WO_recu(Node head) {
    
        Node prev = null, curr = head, next1;
        
        while (curr != null) {
            next1 = curr.next;
            curr.next = prev;       //at first it will assign the value null(next) to first node
            prev = curr;
            curr = next1;
        }
        return prev;
    }

    static void Display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
    
    /*     Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = null;
    
       // Node head1 = ReverseLLRecu(a);
    
    
    Node head1 = Reverse_WO_recu(a);            //Without the recursion give 
    
    
    Display(head1);
       */
      
    LinkedList l1 = new LinkedList<>();
    l1.addLast(1);
    l1.addLast(2);
    l1.addLast(3);
    l1.addLast(4);
    

    LinkedList l2 = new LinkedList<>();
    l2.addLast(9);
    l2.addLast(8);
    l2.addLast(5);
    


       

    }
}
