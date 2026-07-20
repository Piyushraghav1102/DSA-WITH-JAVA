
public class arrayimp {

    public static class Arrqueue {

        int front = -1;
        int rear = -1;
        int size = 0;

        int arr[] = new int[100];

        public void Enqueue(int data) {

            if (rear == arr.length - 1) {
                System.out.println("Queue is overflow");
                return;
            }

            if (front == -1) {
                front = rear = 0;
                arr[rear] = data;
            }

            else {
                arr[++rear] = data;
            }
            size++;

        }

        public int Dequeue() {

            if (size == 0) {
                System.out.println("Queue is underflow");
            }
            front++;
            size--;
            return arr[front - 1];
        }

        public int peek() {

            if (size == 0) {
                System.out.println("Queue is empty");
            }
            int val = arr[front];
            return val;
        }

        public void Display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class QueueLLimp{
        
        Node Front, Rear, Start, End;
        int size;

        public void Enqueue(int data) {

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
            
        public int Dequeue() {
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

    public static class CirQueueimp {
        int arr[] = new int[5];
        int n = arr.length;
        int front = -1, rear = -1;
        int size = 0;

        public void Enqueue(int data) {

            if (size == n) {
                System.out.println("Circular queue is Overflow");
                return;
            }
            if (size == 0) {
                 front = rear = 0;
                 arr[rear++] = data;
                 size++;
             }
            // else if (rear == n - 1) {
            //     arr[rear] = data;
            //     size++;
            //     rear = (rear + 1) % n;
            // } else {
            //     arr[rear++] = data;
            //     size++;
            // }
            rear = (rear + 1) % n;
            arr[rear] = data;
            size++;

        }

        public void Display() {
            
            if (size == 0) {
                System.out.println("Circular queue is empty ");
                return;
            }
            else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.println(arr[i]);
                }
            }
            else {
                for (int i = front; i < n; i++) {
                    System.out.println(arr[i]);
                }
                for (int j = 0; j <= rear; j++) {
                    System.out.println(arr[j]);
                }
            }
        }

    }

    public static class CicularQueueLLimp{
        
        Node Front, Rear;;
        int size;
        public void Enqueue(int data) {

            Node head = new Node(data);

            if (Front == null && Rear == null) {
                Front = Rear  = head;
                size++;
            } else {
                Rear.next = head;
                Rear = head;
                Rear.next = Front;
                size++;
            }

        }
            
        public int Dequeue() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int data = Front.data;
            Front = Front.next;
            Rear.next = Front;
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
                while (temp !=Rear) {
                    System.out.println(temp.data);
                    temp = temp.next;
                 }
                 System.out.println(temp.data);
                
            }
    }
    
    }



    public static void main(String[] args) {

        Arrqueue q1 = new Arrqueue();

        // q1.Enqueue(1);
        // q1.Enqueue(2);
        // q1.Enqueue(3);                  //Array implementation 
        // q1.Enqueue(4);
        // q1.Display();


        // arrayimp.QueueLLimp QL = new QueueLLimp();
        // QL.Enqueue(1);
        // QL.Enqueue(2);
        // QL.Enqueue(3);``                 //Linked list implementation
        // QL.Enqueue(4);
        // QL.Enqueue(5);
        
        // QL.Display();



        // arrayimp.CirQueueimp CQ = new CirQueueimp();
        // CQ.Enqueue(1);
        // CQ.Enqueue(2);
        // CQ.Enqueue(3);                           Circular queue imp with arr
        // CQ.Enqueue(4);
        // CQ.Enqueue(5);
        // CQ.Display();


        // arrayimp.CicularQueueLLimp CQL = new CicularQueueLLimp();
        // CQL.Enqueue(1);
        // CQL.Enqueue(2);
        // CQL.Enqueue(3);
        // CQL.Enqueue(4);
        // CQL.Enqueue(5);
        
        // CQL.Display();



    }
}
