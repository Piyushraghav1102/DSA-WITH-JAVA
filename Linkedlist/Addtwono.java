import org.w3c.dom.Node;

class Addtwono{
            
    public static class ListNode {
        int val;
        ListNode next;

         ListNode(int val) {
            this.val = val;
        }
    }
        
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
            ListNode l3=new ListNode(0);
    
    int carry=0;
    
            while(l1!=null || l2!= null){
                int sum =l1.val+l2.val+carry;
    
                carry=sum/10;
    
                l3.next=new ListNode(sum%10);
    
                l3=l3.next;
                l2=l2.next;
                l1=l1.next;
                
            }
            while(l1!=null){
                int sum =l1.val+carry;
    
                carry=sum/10;
    
                l3.next=new ListNode(sum%10);
    
                l3=l3.next;
                l1=l1.next;
                
            }
            while(l2!=null){
                int sum =l2.val+carry;
    
                carry=sum/10;
    
                l3.next=new ListNode(sum%10);
    
                l3=l3.next;
                l2=l2.next;
                
                
            }
            if(carry!=0){
                l3.next=new ListNode(carry);
            }
            return l3.next;
        }
    
        public static void Display(ListNode Start) {
            
            if (Start == null) {
                System.out.println("Linked list is Empty");
            } else {
                ListNode temp = Start;
                while (temp != null) {
                    System.out.print(temp.val + " -> ");
                    temp = temp.next;
                }

            }
        }
    
        public static void main(String[] args) {
    
            ListNode a = new ListNode(1);
            ListNode b = new ListNode(2);
            ListNode c = new ListNode(3);
            ListNode d = new ListNode(4);
            
            a.next = b;
            b.next = c;
            c.next = d;






            
            ListNode e = new ListNode(9);
            ListNode f = new ListNode(8);
            ListNode g = new ListNode(5);
        
            e.next = f;
            f.next = g;
            

            ListNode m=addTwoNumbers(a, e);

            Display(m);
        }
}