
public class Linkedlist {

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
            Node temp = Start;

            for (int i = 0; i < ind - 1; i++) {
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
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
        Node temp = Start;
        if (ind > 0 && ind < size - 1) {
            for (int i = 0; i < ind - 1; i++) {
                temp = temp.next;
            }
            deldata = temp.next.data;
            temp.next = temp.next.next;
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
        Node temp = Start, temp2;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        End = temp;
        size--;
        return val;

    }

    public int Searchind(Node Start, int key, int ind) {
        if (Start == null) {
            return -1;
        }

        if (Start.data == key) {
            return ind;
        }
        return Searchind(Start.next, key, ind + 1);
    }

    public void ReverseLL() {
        Node prev = null;
        Node curr =  Start;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Start = prev;

    }

    public Node Findinternode(Node start1, Node Start2,int n,int m) {
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

        Linkedlist LL = new Linkedlist();

        
        
        /* 
        LL.Addfirst(10);
        LL.Addfirst(5);
        LL.Addlast(20);
        LL.AddMiddle(8, 1);
        LL.Display(Start);
        System.out.println();
        */

        // System.out.println("Size of Linkedlist :- " + LL.size);
        // System.out.println("Deleted node from first is :- " + LL.Deletionfirst());
        // System.out.println("Size of Linkedlist :- " + LL.size);
        // LL.Display(Start);

        // for index
        int ind = 4;
        System.out.println("Deleted node from " + ind + "index :- " +
                LL.Deletionmiddle(ind));
        LL.Display(Start);
        // System.out.println("Size of Linkedlist :- " + LL.size);

        // for last index check
        // System.out.println("Deletion from last :-" + LL.Deletionlast());
        // System.out.println("Size of Linkedlist :- " + LL.size);
        // LL.Display(Start);

        // System.out.println(" Index of Linkedlist :- " + LL.Searchind(Start, 20, 0));

        // Reverse linked list
        // LL.ReverseLL();
        // LL.Display(Start);
    }
}
