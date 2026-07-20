import java.util.Deque;
import java.util.LinkedList;

import org.w3c.dom.Node;

public class Dequeu {
        
public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    
public static class DqLLimp{
        
        Node Front, Rear, Start, End;
        int size;

        public void Addlast(int data) {

            Node head = new Node(data);

            if (Front == null && Rear == null) {
                Front = Rear = Start = End = head;
                size++;
            } else {
                Rear.next = head;
                Rear = head;
                End = head;
                size++;
            }
        }
        
        public void Addfirst(int data) {

            Node head = new Node(data);

            if (Front == null && Rear == null) {
                Front = Rear = Start = End = head;
                size++;
            } else {
                head.next = Front;
                Front = head;
                size++;
            }
        }
            
        public int RemoveFirst() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int data = Front.data;
            Front = Front.next;
            Start = Front;
            size--;
            return data;
        }
    
        public int RemoveLast() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int data = -1;
            Node temp = Front;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = null;
            Rear = temp;
            size--;
            return data;
        }
    
        public int Peek() {

            if (size == 0) {
                System.out.print("Queue is empty");
            }
            int data = Front.data;
            return data;
        }
    
        public void Display() {

            if (size == 0) {
                System.out.println(" Queue is empty");
                return;

            }else{
                Node temp = Front;
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.next;
                 }
                
            }
    }
    
    }
    public static void main(String[] args) {
        
        
        DqLLimp dq = new DqLLimp();
        dq.Addlast(1);
        dq.Addlast(2);
        dq.Addlast(3);
        dq.Addlast(4);
        dq.Addlast(5);
        dq.Addfirst(0);
        System.out.println(" Deleted data :- " + dq.RemoveLast());
        System.out.println(" Deleted data :- " + dq.RemoveFirst());
        
       dq.Display(); 

    }
}
