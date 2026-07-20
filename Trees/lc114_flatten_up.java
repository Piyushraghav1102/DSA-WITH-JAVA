import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class lc114_flatten_up {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preordertraversal(Node root,List<Node> l){
        if(root==null)return ;

        l.add(root);
        preordertraversal(root.left,l);
        preordertraversal(root.right,l);

    }

    public void flatten(Node root) {
        if(root==null)return;

        List<Node> l=new LinkedList<>();

        preordertraversal(root,l);

        for (int i = 0; i < l.size(); i++) {
            l.get(i).right=l.get(i+1);
            l.get(i).left=null;
        }

    }
    static void main(String[] args) {

    }
}
