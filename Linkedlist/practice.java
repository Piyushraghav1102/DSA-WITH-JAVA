

public class practice {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
   
    public static Node Findnthnode(Node head, int n) {

        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        for (int i = 1; i <= size - n; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public static Node removeNthFromEnd(Node head, int n) {
        
        Node fast = head;
        Node slow = head;
        
        

        for (int i = 1; i <=n; i++) {
            fast = fast.next;
        }
        
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;   
    }
    
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d= new Node(400);
        a.next = b;
        b.next = c;
        c.next = d;
    //    Node temp2 = Findnthnode(a, 2);
        print(a);

        // System.out.println("data of nth node :-"+temp2.val);

        Node temp2 = removeNthFromEnd(a, 2);
        
        print(temp2);
}
}



