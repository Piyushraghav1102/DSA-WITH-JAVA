
public class Findintersect {

    public class Node {
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
            Node temp = Start;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

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

    public Node Findinternode(Node start1, Node Start2, int n, int m) {
        Node temp = Start;
        Node temp2 = Start2;

        for (int i = 1; i < n - m; i++) {
            temp = temp.next;
        }

        while (temp == temp2) {
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp;
    }

    public static void main(String[] args) {

        

    }
}
