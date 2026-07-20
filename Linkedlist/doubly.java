class doubly{
    
    class Node{
        int data;
        Node prev;
        Node next;
        
        public Node (int data){
            this.data=data;
        }
    }
    
    public static Node Start=null,End=null;
    public int size;

    public void Addfirst(int data){
        
        size++;
        
        Node head=new Node(data);

        if(Start==null){
            head.next=head.prev=null;
            Start=End=head;
            
            return;
        }

        head.next=Start;
        Start.prev=head;
        Start=head;
        Start.prev=null;

    }

    public void AddLast(int data){

        size++;
        
        Node head=new Node(data);

        if(Start==null){
            Start=End=head;

            return;
        }

        Node temp=Start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
        head.next=null;
        End=head;

    }
    
    public void Addmiddle(int data,int index){

        size++;//Everytime we enter in method it will increase
        
        Node head=new Node(data);

        if(Start==null){
            Start=End=head;
            return;
        }

        Node temp=Start;

        if(index==1){

        head.next=Start;
        Start.prev=head;
        Start=head;
        Start.prev=null;
        
        }
        
        if(index>1){
            for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
            Node temp2=temp.next;
            temp.next=head;
            head.prev=temp;
            head.next=temp2;
            temp2.prev=head;
        }
    }
    
    public void Display(Node Start){

        if(Start==null){
            System.out.print("--Doubly linked list is empty--");
        }
        
        else{System.out.print("Display the nodes :- ");
        Node temp=Start;
        while(temp!=null){
            System.out.print(+temp.data+"->");
            temp=temp.next;
        }
    }
    }

    public int Deletefirst(){

    
        if(Start==null){
            System.out.println("Doubly linked list is empty");
        }

        if(size==1){
            int data=Start.data;
            Start=End=null;
            size--;
            return data;
        }
        else{

            int data=Start.data;
            Start=Start.next;
            Start.prev=null;
            size--;
            return data;
        }


    }

    public int DeleteLast(){

        if(Start==null){
            System.out.println("Doubly linked list is empty");
        }

        if(size==1){
            int data=End.data;
            Start=End=null;
            size--;
            return data;
        }
        else{
            int data=End.data;
            End=End.prev;
            size--;
            return data;

        }


    }
    
    public int Deletemid(int ind) {
        int val = -1;

        if (Start == null) {
            System.out.println("Doubly linked list is empty");
        }

        if (size == 1) {
            int data = End.data;
            Start = End = null;
            size--;
            return data;
        }

        if (size > 1) {

            Node temp = Start;
            for (int i = 1; i < ind - 1; i++) {
                temp = temp.next;
            }
            val = temp.data;
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
        return val;
    }
    
    public int Deletenth(int ind) {//Delete from end nth

        //1st approach
       /*  Node temp = Start;
        for (int i = 1; i < size - ind; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    */

        //2nd approach

        Node slow = Start;
        Node fast = Start;

        for (int i = 1; i <=ind; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        int val = slow.next.data;
        slow.next = slow.next.next;
        slow.next.prev = slow;
        return val;
        

}

    public void ReverseDisplay(Node End){

        if(Start==null){
            System.out.print("Doubly linked list is empty");
        }
            System.out.print("Display the reverse :-");
        Node temp=End;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        
        doubly DL=new doubly();

        DL.AddLast(1);
        DL.AddLast(2);
         DL.AddLast(3);
         DL.AddLast(4);
         DL.Display(Start);
        System.out.println();
        
        // DL.ReverseDisplay(End);
        // System.out.println();
        
        //Add in middle
        // System.out.println("Size of the Doubly linked list :-"+DL.size);
        // DL.Addmiddle(6, 4);
        // DL.Display(Start);
    
    //Deleted from first
    //System.out.println("Deleted data in node :-"+DL.Deletefirst());
    //DL.Display(Start);
   
    //Deletd from last
    // System.out.println("Deleted data in last node :-"+DL.DeleteLast());  
    // DL.Display(Start);    

    //Delete from middle
    // System.out.println("Deleted data from middle :-"+DL.Deletemid(2));  
    // DL.Display(Start);    
    

    //Delete from end nth
   System.out.println( "Deleted node :-"+DL.Deletenth(2));
    DL.Display(Start);
    }
}