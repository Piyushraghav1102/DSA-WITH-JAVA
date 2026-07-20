import java.util.LinkedList;
import java.util.List;

public class Lc230kthsmallest {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void calculatekthsmallapp1(Node root, List<Node> l){
        if(root==null)return ;

        calculatekthsmallapp1(root.left,l);
        l.addLast(root);
        calculatekthsmallapp1(root.right,l);
    }

    public static int result=0;
    public static void calculatekthsmallapp2(Node root,int[] k){
        if(root==null)return ;

        calculatekthsmallapp2(root.left,k);
        k[0]--;
        if(k[0]==0)result=root.val;
        calculatekthsmallapp2(root.right,k);

    }
    public int kthSmallest(Node root, int k) {
        List<Node> l=new LinkedList<>();

//        calculatekthsmallapp1(root,l);
//        Node curr=l.get(k);
//        return curr.val;

        int[] count={k};
        calculatekthsmallapp2(root,count);
        return result;
    }
    static void main(String[] args) {

    }
}
