
public class merge {

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

    public Node getmid(Node Start) {
        Node slow = Start;
        Node fast = Start;

        while (fast != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeNode(Node RightStart, Node LeftStart) {
        Node Node1 = new Node(-1);
        Node temp = Node1;

        while (RightStart != null && LeftStart != null) {
            if (LeftStart.data <= RightStart.data) {
                temp.next = LeftStart;
                LeftStart = LeftStart.next;
                temp = temp.next;
            } else {
                temp.next = RightStart;
                RightStart = RightStart.next;
                temp = temp.next;

            }
        }
        while (LeftStart != null) {
            temp.next = LeftStart;
            LeftStart = LeftStart.next;
            temp = temp.next;
        }
        while (RightStart != null) {
            temp.next = RightStart;
            RightStart = RightStart.next;
            temp = temp.next;
        }
        return Node1.next;
    }

    public Node Mergesort(Node Start) {
        if (Start == null && Start.next == null) {
            return Start;
        }

        Node midnode = getmid(Start);
        Node Rightnode = midnode.next;
        midnode.next = null;
        Node LeftStart = Mergesort(Start);
        Node RightStart = Mergesort(Rightnode);

        return mergeNode(RightStart, LeftStart);
    }

    public static void main(String[] args) {
        merge LL = new merge();
        LL.Addfirst(1);
        LL.Addfirst(2);
        LL.Addfirst(2);
        LL.Addfirst(4);
        LL.Addfirst(5);
        LL.Addfirst(6);
        LL.Addfirst(7);
        LL.Addfirst(8);

        LL.Display(Start);
        Node Start = LL.Mergesort(LL.Start);
        LL.Display(Start);
    }
}
