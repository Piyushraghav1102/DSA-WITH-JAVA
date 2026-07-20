
import java.util.LinkedList;
import java.util.Scanner;

public class Zigzag{

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node Start, End;// initalize the Pointer which is type of Node (hold the add of nodes)
    public static int size;

    public void Display(Node Start) {
        if (Start == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node Right = Start;
            while (Right != null) {
                System.out.print(Right.data + " -> ");
                Right = Right.next;
            }

        }

    }

    public void Addfirst(int data) {
        Node head = new Node(data); // This is ADD First Method
        size++;
        if (Start == null) {
            Start = End = head;
            return;
        } else {
            head.next = Start;
            Start = head;
            System.out.println("Node Inserted succesfully");
        }
    }

    public void AddMiddle(int data, int ind) {
        Node head = new Node(data);
        size++;
        if (Start == null) {
            Start = End = head;
        } else {
            Node Right = Start;

            for (int i = 0; i < ind - 1; i++) {
                Right = Right.next;
            }
            head.next = Right.next;
            Right.next = head;
        }
    }

    public void Addlast(int data) {
        Node head = new Node(data); // This is Insert LAST Method
        size++;
        if (Start == null) {
            Start = End = head;
            return;
        } else {
            End.next = head;
            End = head;
        }
    }

    public int Deletionfirst() {
        if (Start == null) {
            System.out.println("Linked list is empty");
        }
        int val = Start.data;
        Start = Start.next;
        size--;
        return val;

    }

    public int Deletionmiddle(int ind) {

        int deldata = -1;
        if (Start == null) {
            System.out.println("Linkedlist is empty");
        }
        Node Right = Start;
        if (ind > 0 && ind < size - 1) {
            for (int i = 0; i < ind - 1; i++) {
                Right = Right.next;
            }
            deldata = Right.next.data;
            Right.next = Right.next.next;
            size--;
        }
        if (ind == 0) {
            Deletionfirst();
        }
        if (ind == size) {
            Deletionlast();
        }
        return deldata;
    }

    public int Deletionlast() {

        if (Start == null) {
            System.out.println("Linkedlist is empty");

        }
        Node Right = Start, Right2;
        for (int i = 0; i < size - 2; i++) {
            Right = Right.next;
        }
        int val = Right.next.data;
        Right.next = null;
        End = Right;
        size--;
        return val;

    }

    public static boolean checkcycle(Node Start) {
        Node slow = Start;
        Node fast = Start;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void Removecycle(Node Start) {

        // Detect the cycle
        Node slow = Start;
        Node fast = Start;
        Boolean cycle = false;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                cycle = true;
            }
        }

        // detect
        if (cycle == false) {
            return;
        } else {
            // Remove the cycle
            slow = Start;
            Node prev = null;

            while (slow == fast) {
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null;
            System.out.println("Cycle is removed from LL");

        }
    }

    public static void Zigzag(Node Start){
 
        //Calculate the midnode
        Node slow =Start;
        Node fast =Start.next;
 
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node midnode =slow;
        
        //prev is called midnode
        
        Node curr=midnode.next;
        Node prev=midnode;
        midnode.next=null;

        while(curr!=null){
            Node next=curr.next;
        
            //reverse link
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        

        //now we do LeftStart & RightStart
        Node LeftStart=Start;
        Node RightStart=curr;
        Node Ltemp,Rtemp;

        while(LeftStart!=null && RightStart!=null){
        Ltemp=LeftStart.next;
        LeftStart.next=RightStart;
        Rtemp=RightStart.next;
        RightStart.next=Ltemp;
        
        LeftStart=Ltemp;
        RightStart=Rtemp;
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zigzag LL = new Zigzag();
        LL.Addlast(1);
        LL.Addlast(2);
        LL.Addlast(3);
        LL.Addlast(4);
        LL.Addlast(5);
        LL.Display(Start);
        
        System.out.println();
       
        LL.Zigzag(Start);
        LL.Display(Start);
       
    }
}
