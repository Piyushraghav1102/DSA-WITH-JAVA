public class ArrLink {
      
    //Array Implementation 
    public static class Stack {
        private int[] arr = new int[5];

        private int idx = -1;
       
        public void Push(int x) {
       
            if (idx == arr.length - 1) {
                System.out.println("Overflow stack");
            }
            else {
                arr[++idx] = x;
            }
        }

        public void Pop(int x) {
            
            if (idx == -1) {
                System.out.println(" Underflow");
            }
            else {
                int val = arr[--idx];
                
        }
        }


        public void Display() {
            if (idx == -1) {
                System.out.println("Stack is empty");
            } else {

                for (int i = 0; i <= idx; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        
        public boolean Isempty() {

            if (idx == -1) {
                System.out.println("Stack is Underflow");
                return true;
            }
            return false;
        }
        
        public boolean Isfull() {

            if (idx == arr.length-1) {
                System.out.println("Stack is Overflow");
                return true;
            }
            return false;
        }
        
}
    

//Linked list implementation
    public static class Linked {
    int data;
    Linked next;

    public Linked(int data) {
        this.data = data;
    }

    public static Linked Start, End;

    public void Push(int data) {
        Linked head = new Linked(data);

        if (Start == null) {
            Start = End = head;
        } else {
            End.next = head;
            End = head;
        }
    }

    public void Display() {
        if (Start == null) {
            System.out.println("Stack is underflow");
        } else {
            Linked temp = Start;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }

    public void Pop() {
        if (Start == null) {
            System.out.println("Stack is Underflow");
        } else {
            Linked Temp = Start;
            while (Temp.next.next != null) {
                Temp = Temp.next;
            }
            End = Temp;
            End.next = null;
        }
    }

    public void Peek() {
        
        if (Start == null) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peek is :-"+End.data);
        }
    } 
}
    
    public static void main(String[] args) {
        Stack s = new Stack();

        Linked s1 = new Linked(1);

        // s.Push(1);
        // s.Push(2);
        // s.Push(3);
        // s.Push(4);
        // s.Push(5);
        //s.Display();
        //System.out.println(s.Isempty());
    
    
        //Stack with Linked lists
        s1.Push(1);
        s1.Push(3);
        s1.Push(4);
        s1.Display();
        s1.Pop();
        System.out.println();
        s1.Display();

        s1.Peek();
        
    }
}
